package cn.lcx.demo.ssm.controller;

import cn.lcx.demo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(String userId){
        userService.queryUserByUserId(userId);
        return "success";
    }
}
