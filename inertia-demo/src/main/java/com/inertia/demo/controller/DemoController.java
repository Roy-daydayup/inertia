package com.inertia.demo.controller;

import com.inertia.demo.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 张钰磊
 * @Date: 2021-01-14 16:55
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/{id}")
    private User findOne(@PathVariable Long id) {
        User user = new User();
        user.setDesp("测试");
        user.setId(id);
        user.setName("测试用户");
        return user;
    }

}
