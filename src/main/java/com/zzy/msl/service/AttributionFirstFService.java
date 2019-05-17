package com.zzy.msl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzy.msl.dao.adv.AttributionFirstFDao;
import com.zzy.msl.domain.adv.AttributionFirstF;

@Service
public class AttributionFirstFService {

    @Autowired
    private AttributionFirstFDao attributionFirstFDao;
    
    public List<AttributionFirstF> getAttributionFirstF(){
        return attributionFirstFDao.select();
    }
}
