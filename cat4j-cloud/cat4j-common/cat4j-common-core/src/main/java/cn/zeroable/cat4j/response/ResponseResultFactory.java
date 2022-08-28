package cn.zeroable.cat4j.response;

import cn.zeroable.cat4j.object.AbstractObjectFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 响应结果集工厂类.
 * <br/> 响应结果集工厂类.
 *
 * @author zeroable
 * @version 2022/8/28 17:49
 * @see
 * @since 0.0.1
 */
@Component
public class ResponseResultFactory extends AbstractObjectFactory<ResponseResult> {

    public ResponseResultFactory(List<ResponseResult> list) {
        super(list);
    }

    /**
     * 返回成功响应结果集.
     * <br/> 返回成功响应结果集,一般是 POST、DELETE等非GET请求接口使用.
     *
     * @return cn.zeroable.cat4j.response.Result
     * @throws
     * @author zeroable
     **/
    public Result ok() {
        return ok(null);
    }

    /**
     * 根据响应数据返回成功响应结果集.
     * <br/> 根据响应数据返回成功响应结果集.
     *
     * @param data 响应数据
     * @return cn.zeroable.cat4j.response.Result
     * @throws
     * @author zeroable
     **/

    public Result ok(Object data) {
        return getObject(ResultConst.SUCCESS_CODE.toString()).createResult(data);
    }
}
