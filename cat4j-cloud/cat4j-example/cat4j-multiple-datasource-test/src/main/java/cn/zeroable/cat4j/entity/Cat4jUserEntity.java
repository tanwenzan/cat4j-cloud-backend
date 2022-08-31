package cn.zeroable.cat4j.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 简介
 * <br/> 类功能说明
 *
 * @author zeroable
 * @version 2022/8/31 22:59
 * @see
 * @since 0.0.1
 */
@Data
@AllArgsConstructor
@TableName("cat4j_user")
public class Cat4jUserEntity implements Serializable {
    private Integer id;
    private String loginUser;
    private String loginPassword;
}
