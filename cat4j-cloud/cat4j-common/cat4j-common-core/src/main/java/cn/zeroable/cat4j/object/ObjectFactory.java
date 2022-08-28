package cn.zeroable.cat4j.object;

/**
 * 对象工厂接口.
 * <br/> 对象工厂最基础的接口，所有对象工厂扩展接口、抽象类、实现类都应该直接或者间接派生于此类.
 * <br/> 此接口在{@code Spring Ioc} 容器基础上进行分组管理，管理那些同类型场景下不同的实现方式,
 *
 * @author zeroable
 * @version 2022/8/28 16:58
 * @see cn.zeroable.cat4j.object.Type
 * @since 0.0.1
 */
public interface ObjectFactory<T extends Type> {
    /**
     * 通过{@link Type#getType() getType getType()} 返回值进行获取对象实例.
     * <br/> 通过{@link Type#getType() getType} 返回值进行获取对象实例.
     *
     * @param type 类型唯一标识符，详见{@link Type#getType() getType()}
     * @return T 通过类型唯一标识符进行命中的实例对象
     * @throws java.lang.IllegalArgumentException 如果类型唯一标识符在对应缓存中寻找不到.
     * @author zeroable
     **/
    T getObject(String type);
}
