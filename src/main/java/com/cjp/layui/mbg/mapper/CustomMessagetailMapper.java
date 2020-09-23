package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.CustomMessagetail;

public interface CustomMessagetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomMessagetail record);

    int insertSelective(CustomMessagetail record);

    CustomMessagetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomMessagetail record);

    int updateByPrimaryKey(CustomMessagetail record);
}