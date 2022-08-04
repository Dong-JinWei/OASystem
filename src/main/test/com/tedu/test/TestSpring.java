package com.tedu.test;

import com.tedu.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * 测试 spring 开发环境
 */
public class TestSpring {

    @Test
    public void testSpring(){
        //1. 加载核心配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        //2. 获取bean实例
        User user = context.getBean("user", User.class);

        System.out.println(user);

    }
}
