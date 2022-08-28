package cn.zeroable.cat4j.object;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 对象工厂抽象类.
 * <br/> 抽取了一些常用的方法.
 *
 * @author zeroable
 * @version 2022/8/28 16:32
 * @see cn.zeroable.cat4j.object.ObjectFactory 对象工厂.
 * @see cn.zeroable.cat4j.object.Type 类型唯一标识符接口.
 * @since 0.0.1
 */
@Slf4j
public abstract class AbstractObjectFactory<T extends Type> implements ObjectFactory<T> {

    /**
     * 对象实例缓存Map
     */
    private final Map<String, T> objectMap = new ConcurrentHashMap<>();
    
    /**
     * 初始化标识
     */
    private volatile AtomicBoolean isInit = new AtomicBoolean(false);

    public AbstractObjectFactory(List<T> list) {
        initObjectFactory(list);
    }

    /**
     * 初始化对象工厂.
     * <br/> 初始化对象工厂.
     *
     * @param list 对象实例集合.
     * @return void
     * @throws
     * @author zeroable
     **/
    protected void initObjectFactory(List<T> list) {
        Assert.isTrue(isInit.compareAndSet(false, true), "跳过初始化：对象工厂已经初始化，不需要重复初始化。");
        for (T item : list) {
            addObject(item);
        }
    }

    private void addObject(T object) {
        checkRepetition(object);
        objectMap.put(object.getType(), object);
    }

    /**
     * 检查重复项.
     * <br/> 检查实例对象是否符合要求，其中getType()是否返回空、空字符串、是否存在相同返回.
     *
     * @param object 对象实例
     * @return void
     * @throws java.lang.IllegalArgumentException 如果对象实例 {@code getType() } 返回{@code null}、空字符串、
     *                                            存在相同返回
     * @author zeroable
     **/
    private void checkRepetition(T object) {
        String type = object.getType();
        Class clazz = object.getClass();
        Assert.isTrue(!ObjectUtils.isEmpty(type), String.format("类中getType 返回值为空，请检查是否忘记填写，class为：%s"
                , clazz));
        Assert.isTrue(!objectMap.containsKey(type)
                , String.format("不能存在多个相同的实现,重复类型：%s,重复实现类为: %s 和 %s"
                        , type
                        , clazz
                        , objectMap.get(type))
        );
    }

    @Override
    public final T getObject(String type) {
        Assert.isTrue(objectMap.containsKey(type), String.format("不存在 %s 类型的实现，请检查类型是否出错。", type));
        return objectMap.get(type);
    }


}
