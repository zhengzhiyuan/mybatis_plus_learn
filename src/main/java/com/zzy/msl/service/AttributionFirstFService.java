package com.zzy.msl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.msl.dao.adv.AttributionFirstFDao;
import com.zzy.msl.domain.adv.AttributionFirstF;

@Service
public class AttributionFirstFService {

    @Autowired
    private AttributionFirstFDao attributionFirstFDao;

    public List<AttributionFirstF> getAttributionFirstF() {
        return attributionFirstFDao.selectList(null);
    }

    public IPage<AttributionFirstF> getAttributionFirstFByPage(Long current, Long size) {
        Page<AttributionFirstF> pageParam = new Page<>(5,20);
//        pageParam.setPages(2);
//        pageParam.setCurrent(current);
//        pageParam.setSize(size);
//        pageParam.
        IPage<AttributionFirstF> result = attributionFirstFDao.selectPage(pageParam, null);
        return result;
    }

}
