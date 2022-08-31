package cn.zeroable.cat4j.starter.redis.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * redis配置属性
 * <br/> redis配置属性
 *
 * @author zeroable
 * @version 2022/8/28 18:23
 * @see
 * @since 0.0.1
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisProperties {
    private Integer timeout;
    private Integer database;
    private String type;
    private Integer port;
    private String host;
    private String password;
    private Cluster cluster;

    public static class Cluster {
        private List<String> nodes;

        public List<String> getNodes() {
            return nodes;
        }

        public void setNodes(List<String> nodes) {
            this.nodes = nodes;
        }
    }
}
