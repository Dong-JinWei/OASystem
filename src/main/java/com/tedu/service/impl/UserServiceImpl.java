package com.tedu.service.impl;

import com.tedu.dao.UserDao;
import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public List<User> findAll(String uname, Integer page, Integer rows) {
        List<User> list = userDao.findAll(uname, (page-1)*rows, rows);
        return list;
    }

    public int count(String uname) {
        int count = userDao.count(uname);
        return count;
    }


    public boolean save(User user) {
        return userDao.save(user) > 0;
    }

    public User getUserById(Integer uid) {
        System.out.println(uid);
        return userDao.getUserById(uid);
    }

    public boolean edit(User user) {
        return userDao.edit(user) > 0;
    }

    public boolean remove(List<Integer> list) {
        return userDao.remove(list) > 0;
    }
}
