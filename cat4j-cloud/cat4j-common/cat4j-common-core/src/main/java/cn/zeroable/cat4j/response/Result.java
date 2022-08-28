package cn.zeroable.cat4j.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 结果集
 * <br/> 结果集
 *
 * @author zeroable
 * @version 2022/8/28 17:57
 * @see
 * @since 0.0.1
 */
@Data
@AllArgsConstructor
public final class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    /**
     * 根据响应码、响应消息、响应数据创建结果集.
     * <br/> 根据响应码、响应消息、响应数据创建结果集.
     *
     * @param code 响应码
     * @param msg  响应消息
     * @param data 响应数据
     * @return cn.zeroable.cat4j.response.Result<T>
     * @throws
     * @author zeroable
     **/
    public static final <T> Result<T> createResult(Integer code, String msg, T data) {
        return new Result<>(code, msg, data);
    }
}
