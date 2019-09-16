package com.lanqiao.circle.service.impl;

import com.lanqiao.circle.entity.RelationShipKey;
import com.lanqiao.circle.mapper.RelationShipMapper;
import com.lanqiao.circle.service.RelationShipService;
import com.lanqiao.circle.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 王昊
 * @Date 2019/9/16 6:30 下午
 */
@Service
public class RelationShipServiceImpl implements RelationShipService {
    @Autowired
    RelationShipMapper relationShipMapper;

    @Override
    public Result ifConcern(int loginId, int userId) {
        try{
            RelationShipKey relationShipKey = new RelationShipKey();
            relationShipKey.setBloggerId(userId);
            relationShipKey.setFansId(loginId);
            if (relationShipMapper.selectByPrimaryKey(relationShipKey) != null){
                return Result.createSuccessResult();
            }else {
                return Result.createByFailure("没有关注！");
            }
        }catch (Exception e){
            return Result.createByFailure("操作异常，请联系管理人员！");
        }
    }
}
