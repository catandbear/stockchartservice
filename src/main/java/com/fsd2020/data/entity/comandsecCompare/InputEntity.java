package com.fsd2020.data.entity.comandsecCompare;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InputEntity {

    //// {"companyName":"company1", "sectorName":"sector1", "startTime": "2020-05-3 12:33", "endTime": "2020-05-3 12:33"}
    private String company;
    private String sector;
    private String start;
    private String end;
}
