package com.fsd2020.data.entity.singlesector;

import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ReturnEntity {

    private String name;
    List<PriceReturnEntity> price1;
    List<PriceReturnEntity> price2;

}
