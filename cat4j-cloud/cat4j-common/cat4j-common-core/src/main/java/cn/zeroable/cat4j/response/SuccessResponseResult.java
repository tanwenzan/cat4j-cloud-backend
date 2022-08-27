package cn.zeroable.cat4j.response;

import org.springframework.stereotype.Service;

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
