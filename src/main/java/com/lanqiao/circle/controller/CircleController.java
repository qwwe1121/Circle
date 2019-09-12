package com.lanqiao.circle.controller;

import com.lanqiao.circle.service.CircleService;
import com.lanqiao.circle.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 王昊
 * @Date 2019/9/12 7:21 下午
 */
@RequestMapping("/circle")
@RestController
public class CircleController {
    @Autowired
    CircleService circleService;

    /**
     * 查看圈子基本信息
     * @param circleId
     * @return
     */
    @PostMapping("circleInfo")
    public Result circleInfo(@RequestParam(name = "circleId") int circleId){
        return circleService.circleInfo(circleId);
    }

    @PostMapping("circleBlog")
    public Result circleBlog(@RequestParam(name = "circleId") int circleId,@RequestParam(name = "page") int page,
                             @RequestParam(name = "size") int size){
        return circleService.circleBlog(circleId,page,size);
    }
}
