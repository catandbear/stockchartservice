package com.fsd2020.data.entity.comandsecCompare;

import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OutputEntity {

    private String company;
    private String sector;
    private List<PriceReturnEntity> comprice;
    private List<PriceReturnEntity> secprice;
}
