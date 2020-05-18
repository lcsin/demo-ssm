package cn.lcx.demo.ssm.service.impl;

import cn.lcx.demo.ssm.mapper.UserMapper;
import cn.lcx.demo.ssm.pojo.User;
import cn.lcx.demo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByUserId(String userId) {
        User user = userMapper.queryUserByUserId(userId);
        System.out.println(user);
        return null;
    }
}
