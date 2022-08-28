package cn.zeroable.cat4j.object;


/**
 * 类型唯一标识符接口.
 * <br/> 类型标识符接口,用于同场景下不同方式的唯一接口.
 * <br/> 比如在支付场景下，可以使用支付宝、微信、云闪付、银行卡、信用卡等一些第三方支付方式。那么可以通过一个唯一标识来区分
 * 同的实现类，进行统一管理。从而就不需要使用大量的 {@code if - else if - else or switch}，代码简介、扩展性强、复用性高.
 *
 * @author zeroable
 * @version 2022/8/28 17:07
 * @see cn.zeroable.cat4j.object.ObjectFactory 对象工厂
 * @since 0.0.1
 */
public interface Type {
    /**
     * 返回唯一标识符.
     * <br/> 返回唯一标识符,此唯一的作用域仅限于同场景(同类型)下.
     *
     * @return java.lang.String 唯一标识符
     * @throws
     * @author zeroable
     **/
    String getType();
}
