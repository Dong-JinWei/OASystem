package com.tedu.dao;

import com.tedu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 查询所有用户
     * @return 用户列表
     */
    public List<User> findAll(
            @Param("uname") String uname,
            @Param("page") Integer page,
            @Param("rows") Integer rows
    );

    public int count(@Param("uname") String uname);

    /**
     * 3. 添加用户
     */
    public int save(User user);


    /**
     * 根据id查用户
     * @param uid
     * @return
     */
    User getUserById(Integer uid);


    /**
     * 修改用户
     * @param user
     * @return
     */
    public int edit(User user);

    public int remove(List<Integer> list);
}
