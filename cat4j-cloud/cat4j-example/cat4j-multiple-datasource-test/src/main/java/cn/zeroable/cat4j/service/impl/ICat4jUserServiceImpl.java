package cn.zeroable.cat4j.service.impl;

import cn.zeroable.cat4j.dao.Cat4jUserDao;
import cn.zeroable.cat4j.entity.Cat4jUserEntity;
import cn.zeroable.cat4j.service.ICat4jUserService;
import com.baomidou.dynamic.datasource.annotation.DS;
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
@DS("cat4j-sys")
@Service
public class ICat4jUserServiceImpl extends ServiceImpl<Cat4jUserDao, Cat4jUserEntity> implements ICat4jUserService {
}
