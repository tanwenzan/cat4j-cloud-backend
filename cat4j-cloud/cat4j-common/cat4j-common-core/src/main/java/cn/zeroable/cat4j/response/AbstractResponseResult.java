package cn.zeroable.cat4j.response;


/**
 * 响应结果集
 * <br/> 类功能说明
 *
 * @author zeroable
 * @version 2022/8/28 21:34
 * @see
 * @since 0.0.1
 */
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
