package com.lanqiao.circle.service;

import com.lanqiao.circle.entity.Blog;
import com.lanqiao.circle.util.Result;

/**
 * @Author 王昊
 * @Date 2019/9/11 7:12 下午
 */
public interface BlogService {
    //转发微博
    public Result forwardBlog(Blog blog);
}