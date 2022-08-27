package cn.zeroable.cat4j.response;

import cn.zeroable.cat4j.object.Type;

public interface ResponseResult extends Type {

    Integer code();

    String msg();

    Result createResult(Object data);

}
