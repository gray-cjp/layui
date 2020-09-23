package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.SchoolBill;

public interface SchoolBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SchoolBill record);

    int insertSelective(SchoolBill record);

    SchoolBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SchoolBill record);

    int updateByPrimaryKey(SchoolBill record);
}