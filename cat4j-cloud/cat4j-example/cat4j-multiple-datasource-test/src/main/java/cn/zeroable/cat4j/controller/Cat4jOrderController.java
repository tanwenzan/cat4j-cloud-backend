package cn.zeroable.cat4j.controller;

import cn.zeroable.cat4j.entity.Cat4jOrderEntity;
import cn.zeroable.cat4j.response.Result;
import cn.zeroable.cat4j.service.ICat4jOrderService;
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
 * @version 2022/8/31 22:44
 * @see
 * @since 0.0.1
 */
@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class Cat4jOrderController extends BaseController {

    private ICat4jOrderService iCat4jOrderService;

    @GetMapping("/{orderId}")
    public Result<Cat4jOrderEntity> getOrderById(@PathVariable Integer orderId) {
        return ok(iCat4jOrderService.getById(orderId));
    }
}
