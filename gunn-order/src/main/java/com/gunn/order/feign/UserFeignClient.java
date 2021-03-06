package com.gunn.order.feign;

import com.gunn.entity.User;
import com.gunn.order.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ganjunhui
 * @date 2020/1/5 3:18 下午
 */
@FeignClient(value = "gunn-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @GetMapping("/user/userInfo/{id}")
    User getUserInfo(@PathVariable("id") Integer id);

}
