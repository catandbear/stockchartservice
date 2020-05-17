package com.fsd2020.controller;

import com.fsd2020.data.entity.comandsecCompare.InputEntity;
import com.fsd2020.data.entity.comandsecCompare.OutputEntity;
import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;
import com.fsd2020.data.mapper.ChartPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ComandSecCompare {

    private ChartPriceMapper mapper;

    @Autowired
    private ComandSecCompare(ChartPriceMapper mapper) {
        this.mapper = mapper;
    }

    // {"companyName":"company1", "sectorName":"sector1", "startTime": "2020-05-3 12:33", "endTime": "2020-05-3 12:33"}
    @PostMapping("compare/comandsec")
    public OutputEntity compare(@RequestBody(required = true) InputEntity entity){

        System.out.println(entity.toString());

        List<PriceReturnEntity> comprice = mapper.getSingleCompanyPrice(mapper.getCompanyCode(entity.getCompany()), entity.getStart(), entity.getEnd());
        List<PriceReturnEntity> secprice = mapper.getSingleSectorPrice(entity.getSector(), entity.getStart(), entity.getEnd());

        return new OutputEntity(entity.getCompany(), entity.getSector(), comprice, secprice);
    }
}
