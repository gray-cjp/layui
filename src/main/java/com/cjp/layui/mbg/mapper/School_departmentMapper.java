package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.School_department;

public interface School_departmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(School_department record);

    int insertSelective(School_department record);

    School_department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(School_department record);

    int updateByPrimaryKey(School_department record);
}