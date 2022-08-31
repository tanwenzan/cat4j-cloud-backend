package cn.zeroable.cat4j.starter.redis.config;

import cn.zeroable.cat4j.starter.redis.config.properties.RedisProperties;
import cn.zeroable.cat4j.starter.redis.service.RedissonFactory;
import lombok.AllArgsConstructor;
import org.redisson.Redisson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

/**
 * RedissonConfig
 * <br/> RedissonConfig
 *
 * @author zeroable
 * @version 2022/8/28 18:26
 * @see
 * @since 0.0.1
 */

@AllArgsConstructor
@Configuration
public class RedissonConfig {

    private RedisProperties redisProperties;

    private RedissonFactory redissonFactory;

    @Bean
    public Redisson redisson() {
        String type = redisProperties.getType();
        Assert.isTrue(!ObjectUtils.isEmpty(type),
                String.format("redis配置出错：[spring.redis.type]不能为空,请填写后再试！"));
        return redissonFactory.getObject(type).createRedisson();
    }
}
