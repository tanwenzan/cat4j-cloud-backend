package cn.zeroable.cat4j.controller;

import cn.zeroable.cat4j.response.ResponseResultFactory;
import cn.zeroable.cat4j.response.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础Controller.
 * <br/> 基础的Controller，用于封装基本返回响应结果.
 *
 * @author zeroable
 * @version 2022/8/31 22:56
 * @see
 * @since 0.0.1
 */
public class BaseController {
    @Autowired
    ResponseResultFactory responseResultFactory;

    /**
     * 返回成功消息体
     * <br/> 返回成功消息体
     *
     * @return cn.zeroable.cat4j.response.Result 结果集
     * @throws
     * @author zeroable
     **/
    public Result ok() {
        return ok(null);
    }

    /**
     * 返回成功消息体
     * <br/> 返回成功消息体
     *
     * @param data 响应数据
     * @return cn.zeroable.cat4j.response.Result 结果集
     * @throws
     * @author zeroable
     **/
    public Result ok(Object data) {
        return responseResultFactory.ok(data);
    }

    /**
     * 返回错误结果集
     * <br/> 返回错误结果集
     *
     * @param code 错误响应码
     * @return cn.zeroable.cat4j.response.Result
     * @throws
     * @author zeroable
     **/
    public Result error(Integer code) {
        return responseResultFactory.getObject(code.toString()).createResult(null);
    }
}
