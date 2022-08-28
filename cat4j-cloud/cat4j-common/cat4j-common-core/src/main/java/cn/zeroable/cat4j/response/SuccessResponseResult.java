package cn.zeroable.cat4j.response;

import org.springframework.stereotype.Service;

/**
 * 成功响应结果集实现类。
 * <br/> 成功响应结果集实现类
 *
 * @author zeroable
 * @version 2022/8/28 18:01
 * @see
 * @since 0.0.1
 */

@Service
public class SuccessResponseResult extends AbstractResponseResult {
    @Override
    public Integer code() {
        return ResultConst.SUCCESS_CODE;
    }

    @Override
    public String msg() {
        return ResultConst.SUCCESS_MSG;
    }
}
