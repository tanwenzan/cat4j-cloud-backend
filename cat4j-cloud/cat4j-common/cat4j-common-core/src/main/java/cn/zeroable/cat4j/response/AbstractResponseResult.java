package cn.zeroable.cat4j.response;


public abstract class AbstractResponseResult implements ResponseResult {

    @Override
    public String getType() {
        return code().toString();
    }

    @Override
    public Result createResult(Object data) {
        return Result.createResult(code(), msg(), data);
    }
}
