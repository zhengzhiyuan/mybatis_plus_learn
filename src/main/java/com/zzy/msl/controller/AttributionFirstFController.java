package com.zzy.msl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zzy.msl.domain.adv.AttributionFirstF;
import com.zzy.msl.service.AttributionFirstFService;

@RestController
@RequestMapping("/api/v1")
public class AttributionFirstFController {

    @Autowired
    private AttributionFirstFService attributionFirstFService;

    @RequestMapping(path = "/test")
    public List<AttributionFirstF> test() {
        return attributionFirstFService.getAttributionFirstF();
    }

    @RequestMapping(path = "/testPage")
    public IPage<AttributionFirstF> testPage() {
        return attributionFirstFService.getAttributionFirstFByPage(1l, 100l);
    }
}
