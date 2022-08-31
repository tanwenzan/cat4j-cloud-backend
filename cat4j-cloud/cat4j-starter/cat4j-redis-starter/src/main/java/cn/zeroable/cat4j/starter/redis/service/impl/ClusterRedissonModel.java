package cn.zeroable.cat4j.starter.redis.service.impl;

import cn.zeroable.cat4j.starter.redis.config.properties.RedisProperties;
import cn.zeroable.cat4j.starter.redis.consts.RedisConst;
import cn.zeroable.cat4j.starter.redis.service.AbstractRedissonModel;
import org.redisson.Redisson;
import org.redisson.config.ClusterServersConfig;
import org.redisson.config.Config;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code Redisson} 集群模式实现
 * <br/> {@code Redisson} 集群模式实现
 *
 * @author zeroable
 * @version 2022/8/28 22:01
 * @see
 * @since 0.0.1
 */

@Service
public class ClusterRedissonModel extends AbstractRedissonModel {

    public ClusterRedissonModel(RedisProperties redisProperties) {
        super(redisProperties);
    }

    @Override
    public Redisson createRedisson() {
        List<String> clusterNodes = new ArrayList<>();
        for (int i = 0; i < redisProperties.getCluster().getNodes().size(); i++) {
            clusterNodes.add("redis://" + redisProperties.getCluster().getNodes().get(i));
        }
        Config config = new Config();
        ClusterServersConfig clusterServersConfig = config.useClusterServers()
                .addNodeAddress(clusterNodes.toArray(new String[clusterNodes.size()]));
        //设置密码
        if (!ObjectUtils.isEmpty(redisProperties.getPassword())) {
            clusterServersConfig.setPassword(redisProperties.getPassword());
        }
        return (Redisson) Redisson.create(config);
    }

    @Override
    public String getType() {
        return RedisConst.REDISSON_TYPE_CLUSTER;
    }

}
