package com.tedu.service;

import com.tedu.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 查询所有用户
     *
     * @return 用户列表
     */
    public List<User> findAll(String uname, Integer page, Integer rows);

    public int count(String uname);

    /**
     * 添加用户
     * @return
     */
    public boolean save(User user);

    public User getUserById(Integer uid);


    /**
     * 修改用户
     * @param user
     * @return
     */
    public boolean edit(User user);

    public boolean remove(List<Integer> list);
}