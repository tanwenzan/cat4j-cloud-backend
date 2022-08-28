package cn.zeroable.cat4j.response;

import cn.zeroable.cat4j.object.Type;

/**
 * api接口响应结果集
 * <br/> 根据响应码(code)、响应消息(msg)、响应数据(data)、组成一个响应结果集.
 *
 * @author zeroable
 * @version 2022/8/28 17:29
 * @see
 * @since 0.0.1
 */
public interface ResponseResult extends Type {

    /**
     * 响应码
     * <br/> 返回该响应结果的响应码，默认成功响应码为200.
     *
     * @return java.lang.Integer 响应码
     * @throws
     * @author zeroable
     **/
    Integer code();

    /**
     * 响应消息
     * <br/> 返回改响应结果集的响应消息，通常是失败时需要返回给接口调用者失败的具体错误信息.
     *
     * @return java.lang.String 响应消息
     * @throws
     * @author zeroable
     **/
    String msg();

    /**
     * 通过响应数据创建响应结果集。
     * <br/> 通过响应数据创建响应结果集，一般是成功才需要返回数据。
     *
     * @param data 响应数据，返回给接口调用方所需要的数据.
     * @return cn.zeroable.cat4j.response.Result api接口响应结果集.
     * @throws
     * @author zeroable
     **/
    Result createResult(Object data);

}
