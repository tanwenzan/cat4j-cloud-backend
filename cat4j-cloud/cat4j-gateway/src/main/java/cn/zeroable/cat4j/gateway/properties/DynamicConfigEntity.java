package cn.zeroable.cat4j.gateway.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 动态配置实体
 * <br/>create in 2022-07-08
 *
 * @author zeroable
 * @version 1.0
 */
@Component
@Data
@RefreshScope
public class DynamicConfigEntity {

    @Value("${config.version}")
    private String version;
}
