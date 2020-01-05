package com.gunn.user.rpc;

import com.gunn.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ganjunhui
 * @date 2020/1/5 3:13 下午
 */
@RestController
@RequestMapping("user")
public class UserApi {

    @GetMapping("/userInfo/{id}")
    public User userInfo(@PathVariable("id") Integer id) {
        return User.builder()
                .Id(1)
                .age(23)
                .name("ganjunhui")
                .build();
    }
}
