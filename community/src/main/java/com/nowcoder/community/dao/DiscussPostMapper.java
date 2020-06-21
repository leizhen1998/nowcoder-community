package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author leizhen
 * @create 2020-06-04 15:32
 */

@Mapper
public interface DiscussPostMapper {

    /**
     *
     * @param userId
     * @param offset 偏移量
     * @param limit
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /*
    @Param注解用于给参数取别名，
    如果只有一个参数，并且在<if>里使用，则必须加别名。
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
