package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.FindPageFuction;

public interface FindPageFuctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FindPageFuction record);

    int insertSelective(FindPageFuction record);

    FindPageFuction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FindPageFuction record);

    int updateByPrimaryKey(FindPageFuction record);
}