package cn.zeroable.cat4j.service.impl;

import cn.zeroable.cat4j.dao.Cat4jOrderDao;
import cn.zeroable.cat4j.entity.Cat4jOrderEntity;
import cn.zeroable.cat4j.service.ICat4jOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 简介
 * <br/> 类功能说明
 *
 * @author zeroable
 * @version 2022/8/31 22:37
 * @see
 * @since 0.0.1
 */
@Service
public class ICat4jOrderServiceImpl extends ServiceImpl<Cat4jOrderDao, Cat4jOrderEntity> implements ICat4jOrderService {
}
