package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.Schoolinfo;
import com.cjp.layui.mbg.model.SchoolinfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SchoolinfoMapper {
    long countByExample(SchoolinfoExample example);

    int deleteByExample(SchoolinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Schoolinfo record);

    int insertSelective(Schoolinfo record);

    List<Schoolinfo> selectByExample(SchoolinfoExample example);

    Schoolinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Schoolinfo record, @Param("example") SchoolinfoExample example);

    int updateByExample(@Param("record") Schoolinfo record, @Param("example") SchoolinfoExample example);

    int updateByPrimaryKeySelective(Schoolinfo record);

    int updateByPrimaryKey(Schoolinfo record);

    List<Map<String,Object>> selectAll();

    void updateBatch(List<Map<String, String>> mapList);
}