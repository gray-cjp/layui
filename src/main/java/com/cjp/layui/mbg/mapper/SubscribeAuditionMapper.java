package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.SubscribeAudition;

public interface SubscribeAuditionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SubscribeAudition record);

    int insertSelective(SubscribeAudition record);

    SubscribeAudition selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubscribeAudition record);

    int updateByPrimaryKey(SubscribeAudition record);
}