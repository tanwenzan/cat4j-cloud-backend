package cn.zeroable.cat4j.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public final class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public static final <T> Result<T> createResult(Integer code, String msg, T data) {
        return new Result<>(code, msg, data);
    }
}
