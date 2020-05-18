package cn.lcx.demo.ssm.test;

import cn.lcx.demo.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSMTest {

    @Test
    public void test1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:beans.xml");
        UserService userService = (UserService)ioc.getBean("userService");
        userService.queryUserByUserId("admin");
    }
}
