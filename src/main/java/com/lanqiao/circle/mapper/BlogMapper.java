package com.lanqiao.circle.mapper;

import com.lanqiao.circle.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface BlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    List<HashMap> getUserAllblogByUserId(Integer userId);


    List<Blog> normalBlog(@Param("start") int start, @Param("limit") int limit, @Param("content")  String content);
    int getCount(@Param("content")  String content);
    int deleteBlog(Integer blogId);
    List<Blog> findBlog(String content);

}