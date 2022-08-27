package cn.zeroable.cat4j.service;

import cn.zeroable.cat4j.response.ResponseResultFactory;
import cn.zeroable.cat4j.response.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<M, E> {
    @Autowired
    ResponseResultFactory responseResultFactory;

    public Result ok() {
        return responseResultFactory.ok();
    }

    public Result ok(Object data) {
        Result ok = responseResultFactory.ok();
        ok.setData(data);
        return ok;
    }

    public Result error(Integer code) {
        return responseResultFactory.getObject(code.toString()).createResult(null);
    }
}
