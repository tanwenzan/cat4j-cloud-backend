package cn.zeroable.cat4j.controller;

import cn.zeroable.cat4j.entity.Cat4jUserEntity;
import cn.zeroable.cat4j.response.Result;
import cn.zeroable.cat4j.service.ICat4jUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简介
 * <br/> 类功能说明
 *
 * @author zeroable
 * @version 2022/8/31 22:58
 * @see
 * @since 0.0.1
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class Cat4jUserController extends BaseController {

    private final ICat4jUserService iCat4jUserService;

    @GetMapping("/{userId}")
    public Result<Cat4jUserEntity> getUserInfoById(@PathVariable Integer userId) {
        return ok(iCat4jUserService.getById(userId));
    }
}
