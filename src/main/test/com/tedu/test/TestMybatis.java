package com.tedu.test;

import com.tedu.dao.UserDao;
import com.tedu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * 测试mybatis
 */
public class TestMybatis {
    //
    //@Test
    //public void testMybatis() throws IOException {
    //    // 1. 读取核心文件
    //    InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
    //
    //    // 2. 获取sqlSessionFactory
    //    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    //    // 3. 获取session
    //    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    //    // 4. 获取mapper接口
    //    UserDao mapper = sqlSession.getMapper(UserDao.class);
    //    // 5. 调用方法
    //    List<User> allUser = mapper.findAll();
    //    System.out.println(allUser);
    //}
}
