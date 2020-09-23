package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.School_profession;

public interface School_professionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(School_profession record);

    int insertSelective(School_profession record);

    School_profession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(School_profession record);

    int updateByPrimaryKey(School_profession record);
}