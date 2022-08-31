package cn.zeroable.cat4j.starter.redis.service;

import cn.zeroable.cat4j.starter.redis.config.properties.RedisProperties;
import lombok.AllArgsConstructor;

/**
 * {@code RedissonModel} 抽象类.
 * <br/> {@code RedissonModel} 抽象类.
 *
 * @author zeroable
 * @version 2022/8/28 22:58
 * @see
 * @since 0.0.1
 */
@AllArgsConstructor
public abstract class AbstractRedissonModel implements RedissonModel {
    protected RedisProperties redisProperties;
}
