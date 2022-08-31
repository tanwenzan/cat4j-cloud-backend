package cn.zeroable.cat4j.starter.redis.service;

import cn.zeroable.cat4j.object.Type;
import org.redisson.Redisson;

/**
 * {@code Redisson}创建接口.
 * <br/> 通过不同方式进行创建{@code Redisson} 比如单机版、主从、哨兵、集群等。
 *
 * @author zeroable
 * @version 2022/8/28 21:36
 * @see
 * @since 0.0.1
 */
public interface RedissonModel extends Type {
    /**
     * 创建{@code Redisson}
     * <br/> 根据不同业务规模情况实现不同模式的{@code Redisson}
     *
     * @return org.redisson.Redisson
     * @throws
     * @author zeroable
     **/
    Redisson createRedisson();
}