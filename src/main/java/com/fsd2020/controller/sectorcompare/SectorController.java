package com.fsd2020.controller.sectorcompare;

import com.fsd2020.data.entity.MutiInputEntity;
import com.fsd2020.data.entity.MutiOutputEntity;
import com.fsd2020.data.entity.singleCompare.OutputEntity;
import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.singleCompare.InputEntity;
import com.fsd2020.data.mapper.ChartPriceMapper;

import java.util.List;

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
	public OutputEntity conpareSingleSector(@RequestBody(required = true) InputEntity sector) {

		List<PriceReturnEntity> price1 = mapper.getSingleSectorPrice(sector.getName(), sector.getStartTime1(), sector.getEndTime1());
		List<PriceReturnEntity> price2 = mapper.getSingleSectorPrice(sector.getName(), sector.getStartTime2(), sector.getEndTime2());
		return new OutputEntity(sector.getName(), price1, price2);
	}

	@PostMapping("multi")
	public MutiOutputEntity compareMutiSector(@RequestBody(required = true) MutiInputEntity sectors){

		System.out.println(sectors.toString());
		List<PriceReturnEntity> price1 = mapper.getSingleSectorPrice(sectors.getName1(), sectors.getStartTime(), sectors.getEndTime());
		List<PriceReturnEntity> price2 = mapper.getSingleSectorPrice(sectors.getName2(), sectors.getStartTime(), sectors.getEndTime());
		return new MutiOutputEntity(sectors.getName1(), sectors.getName2(), price1, price2);
	}
}
