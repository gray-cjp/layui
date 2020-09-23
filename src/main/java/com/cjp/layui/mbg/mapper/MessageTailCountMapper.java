package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.MessageTailCount;
import com.cjp.layui.mbg.model.MessageTailCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageTailCountMapper {
    long countByExample(MessageTailCountExample example);

    int deleteByExample(MessageTailCountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MessageTailCount record);

    int insertSelective(MessageTailCount record);

    List<MessageTailCount> selectByExample(MessageTailCountExample example);

    MessageTailCount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MessageTailCount record, @Param("example") MessageTailCountExample example);

    int updateByExample(@Param("record") MessageTailCount record, @Param("example") MessageTailCountExample example);

    int updateByPrimaryKeySelective(MessageTailCount record);

    int updateByPrimaryKey(MessageTailCount record);
}