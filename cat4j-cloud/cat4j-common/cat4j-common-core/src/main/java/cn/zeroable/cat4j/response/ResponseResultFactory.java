package cn.zeroable.cat4j.response;

import cn.zeroable.cat4j.object.AbstractObjectFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResponseResultFactory extends AbstractObjectFactory<ResponseResult> {

    public ResponseResultFactory(List<ResponseResult> list) {
        super(list);
    }

    public Result ok() {
        return getObject(ResultConst.SUCCESS_CODE.toString()).createResult(null);
    }
}
