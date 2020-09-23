package com.cjp.layui.mbg.mapper;

import com.cjp.layui.mbg.model.Advertisement;

public interface AdvertisementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    Advertisement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);
}