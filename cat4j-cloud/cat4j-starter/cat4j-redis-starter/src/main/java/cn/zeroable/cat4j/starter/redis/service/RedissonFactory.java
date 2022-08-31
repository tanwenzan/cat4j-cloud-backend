package cn.zeroable.cat4j.starter.redis.service;

import cn.zeroable.cat4j.object.AbstractObjectFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Redisson工厂
 * <br/> Redisson工厂，支持不同模式.
 *
 * @author zeroable
 * @version 2022/8/28 21:07
 * @see
 * @since 0.0.1
 */
@Component
public class RedissonFactory extends AbstractObjectFactory<RedissonModel> {

    public RedissonFactory(List list) {
        super(list);
    }

}
