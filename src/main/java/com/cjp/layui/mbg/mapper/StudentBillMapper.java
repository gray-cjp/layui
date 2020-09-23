package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.StudentBill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentBill record);

    int insertSelective(StudentBill record);

    StudentBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentBill record);

    int updateByPrimaryKey(StudentBill record);

    List<String> selectAll();

    void batchUpatePushtime(@Param("list") List<String> subList);
}