package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author leizhen
 * @create 2020-06-03 21:56
 */

@Mapper
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User selectByName(String username);

    /**
     * 根据邮箱查询用户
     * @param email
     * @return
     */
    User selectByEmail(String email);

    /**
     * 插入一个用户
     * @param user
     * @return 插入数据的行数
     */
    Integer insertUser(User user);

    /**
     * 更新用户状态
     * @param id
     * @param status
     * @return 更新数据的条数
     */
    Integer updateStatus(Integer id, Integer status);

    /**
     * 更新头像路径
     * @param id
     * @param headerUrl
     * @return
     */
    Integer updateHeader(Integer id, String headerUrl);

    /**
     * 更新用户密码
     * @param id
     * @param password
     * @return
     */
    Integer updatePassword(Integer id, String password);
}
