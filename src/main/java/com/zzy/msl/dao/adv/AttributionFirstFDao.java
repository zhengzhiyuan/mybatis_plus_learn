package com.zzy.msl.dao.adv;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzy.msl.domain.adv.AttributionFirstF;

@Mapper
public interface AttributionFirstFDao {
    
    List<AttributionFirstF> select();


}
