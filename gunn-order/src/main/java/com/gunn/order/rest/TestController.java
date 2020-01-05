package com.gunn.order.rest;

import com.gunn.entity.User;
import com.gunn.order.feign.UserFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ganjunhui
 * @date 2020/1/5 3:35 下午
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private UserFeignClient userFeignClient;

    @GetMapping("test")
    public void test() {
        User userInfo = userFeignClient.getUserInfo(2);
        System.out.println("debug");
    }
}
