package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.MessageTail;
import com.cjp.layui.mbg.model.MessageTailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageTailMapper {
    long countByExample(MessageTailExample example);

    int deleteByExample(MessageTailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MessageTail record);

    int insertSelective(MessageTail record);

    List<MessageTail> selectByExample(MessageTailExample example);

    MessageTail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MessageTail record, @Param("example") MessageTailExample example);

    int updateByExample(@Param("record") MessageTail record, @Param("example") MessageTailExample example);

    int updateByPrimaryKeySelective(MessageTail record);

    int updateByPrimaryKey(MessageTail record);
}