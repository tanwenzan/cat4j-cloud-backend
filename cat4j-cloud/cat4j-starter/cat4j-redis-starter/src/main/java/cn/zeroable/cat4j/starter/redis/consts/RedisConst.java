package cn.zeroable.cat4j.starter.redis.consts;

/**
 * {@code Redis} 常量类
 * <br/> {@code Redis} 常量类
 *
 * @author zeroable
 * @version 2022/8/28 22:45
 * @see
 * @since 0.0.1
 */
public class RedisConst {

    /**
     * 单机
     */
    public static final String REDISSON_TYPE_SINGLE = "SINGLE";

    /**
     * 主从
     */
    public static final String REDISSON_TYPE_MASTER_SLAVE = "MASTER_SLAVE";

    /**
     * 哨兵模式
     */
    public static final String REDISSON_TYPE_SENTINEL = "SENTINEL";

    /**
     * 集群
     */
    public static final String REDISSON_TYPE_CLUSTER = "CLUSTER";
}
