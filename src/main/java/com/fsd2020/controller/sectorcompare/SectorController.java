package com.fsd2020.controller.sectorcompare;

import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;
import com.fsd2020.data.entity.singlesector.ReturnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.CompareInputEntity;
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
	public ReturnEntity conpareSingleSector(@RequestBody(required = true) CompareInputEntity sector) {

		List<PriceReturnEntity> price1 = mapper.getSingleSectorPrice(sector.getName(), sector.getStartTime1(), sector.getEndTime1());
		List<PriceReturnEntity> price2 = mapper.getSingleSectorPrice(sector.getName(), sector.getStartTime2(), sector.getEndTime2());
		return new ReturnEntity(sector.getName(), price1, price2);
	}

	@PostMapping("multi")
	public void compareMutiSector(){


	}
}
