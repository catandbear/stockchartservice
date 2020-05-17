package com.fsd2020.controller.sectorcompare;

import com.fsd2020.data.entity.singleCompare.CompareOutputEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.CompareInputEntity;
import com.fsd2020.data.mapper.ChartPriceMapper;

@RestController
@RequestMapping("compare/sector")
@CrossOrigin("*")
public class SectorController {
	private ChartPriceMapper mapper;

	@Autowired
	private SectorController(ChartPriceMapper mapper) {
		this.mapper = mapper;
	}
	
	@PostMapping("single")
	public void conpareSingleSector(@RequestBody(required = true) CompareInputEntity sector) {

		System.out.println(sector.toString());
//		CompareOutputEntity outputEntity =

	}
}
