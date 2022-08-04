package com.tedu.controller;

import com.tedu.dao.UserDao;
import com.tedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class TestSrpingmvcController {

    @Autowired
    UserDao userDao;

    //@RequestMapping("/testmvc")
    //public String testMVC(){
    //    List<User> all = userDao.findAll();
    //    for (User user : all) {
    //        System.out.println(user);
    //    }
    //    return "/index";
    //}
    //
    //@RequestMapping("/testBody")
    //public List<User> testBody(){
    //    List<User> all = userDao.findAll();
    //    return all;
    //}


}
