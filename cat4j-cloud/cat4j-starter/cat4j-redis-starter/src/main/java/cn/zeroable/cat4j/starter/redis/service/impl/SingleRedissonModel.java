package cn.zeroable.cat4j.starter.redis.service.impl;

import cn.zeroable.cat4j.starter.redis.config.properties.RedisProperties;
import cn.zeroable.cat4j.starter.redis.consts.RedisConst;
import cn.zeroable.cat4j.starter.redis.service.AbstractRedissonModel;
import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.stereotype.Service;

/**
 * {@code Redisson} 单机模式实现
 * <br/> {@code Redisson} 单机模式实现
 *
 * @author zeroable
 * @version 2022/8/28 22:01
 * @see
 * @since 0.0.1
 */

@Service
public class SingleRedissonModel extends AbstractRedissonModel {

    /**
     * redisson版本是3.5，集群的ip前面要加上“redis://”，不然会报错，3.2版本可不加
     * <br/>格式 redis://host:port
     */
    private static final String REDIS_ADDRESS = "redis://%s:%s";

    public SingleRedissonModel(RedisProperties redisProperties) {
        super(redisProperties);
    }

    @Override
    public Redisson createRedisson() {
        Config config = new Config();
        config.useSingleServer().setAddress(String.format(REDIS_ADDRESS, redisProperties.getHost(), redisProperties.getPort()))
                .setDatabase(redisProperties.getDatabase())
                .setPassword(redisProperties.getPassword());
        return (Redisson) Redisson.create(config);
    }

    @Override
    public String getType() {
        return RedisConst.REDISSON_TYPE_SINGLE;
    }

}
