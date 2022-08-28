package cn.zeroable.cat4j.gateway.controller;

import cn.zeroable.cat4j.gateway.properties.DynamicConfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * nacos配置接口
 * <br/>create on 2022-07-08
 *
 * @author zeroable
 * @version 1.0
 */
@RestController
@RequestMapping("/nacos")
public class NacosController {

    @Autowired
    DynamicConfigEntity entity;

    @RequestMapping(value = "/test/{id}")
    public String test(@PathVariable("id") String id) {
        return "accept one msg id=" + id + "----- version=" + entity.getVersion();
    }
}
