package cn.lcx.demo.ssm.mapper;

import cn.lcx.demo.ssm.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User queryUserByUserId(String userId);

}
