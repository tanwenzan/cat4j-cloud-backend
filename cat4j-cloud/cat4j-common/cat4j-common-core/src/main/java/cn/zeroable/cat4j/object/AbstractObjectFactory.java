package cn.zeroable.cat4j.object;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AbstractObjectFactory<T extends Type> implements ObjectFactory<T> {

    private final Map<String, T> objectMap = new ConcurrentHashMap<>();
    private volatile AtomicBoolean isInit = new AtomicBoolean(false);

    public AbstractObjectFactory(List<T> list) {
        initObjectFactory(list);
    }

    protected void initObjectFactory(List<T> list) {
        if (isInit.compareAndSet(false, true)) {
            for (T item : list) {
                addObject(item);
            }
            return;
        }
//        log.warn("跳过初始化：对象工厂已经初始化，不需要重复初始化。");
    }

    private void addObject(T object) {
        checkRepetition(object);
        objectMap.put(object.getType(), object);
    }

    /**
     * 检查重复项。
     * <br/>create by zeroable
     * <br/>create in 2022-04-24 18:25
     *
     * @param object
     * @return: void
     */
    private void checkRepetition(T object) {
        String type = object.getType();
        if (objectMap.containsKey(type)) {
            String err = String.format("不能存在多个相同的实现,重复类型：%s,重复实现类为: %s 和 %s",
                    object.getType(),
                    objectMap.getClass(),
                    objectMap.get(type));
            throw new IllegalArgumentException(err);
        }
    }

    @Override
    public final T getObject(String type) {
        if (!objectMap.containsKey(type))
            throw new IllegalArgumentException(String.format("不存在 %s 类型的实现，请检查类型是否出错。", type));
        return objectMap.get(type);
    }


}
