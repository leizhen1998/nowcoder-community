package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author leizhen
 * @create 2020-06-03 22:36
 */

@SpringBootTest
public class MapperTests {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        System.out.println(userMapper.selectById(11));
        System.out.println(userMapper.selectByName("nowcoder13"));
        System.out.println(userMapper.selectByEmail("test@qq.com"));
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUsername("lz");
        user.setPassword("1234");
        user.setSalt("ahs");
        user.setEmail("aaa@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");

        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdateUser() {
        Integer rows = userMapper.updateStatus(164, 1);
        System.out.println(rows);

        rows = userMapper.updateHeader(164, "http://www.nowcoder.com/102.png");
        System.out.println(rows);

        rows = userMapper.updatePassword(164, "hello");
        System.out.println(rows);
    }

    @Test
    public void testSelectPosts() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);
        }
        System.out.println(discussPostMapper.selectDiscussPostRows(0));
        System.out.println(discussPostMapper.selectDiscussPostRows(101));

    }
}
