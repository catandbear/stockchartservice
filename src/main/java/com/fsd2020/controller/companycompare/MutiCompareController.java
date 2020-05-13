package com.fsd2020.controller.companycompare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.mapper.ChartPriceMapper;

@RestController
@CrossOrigin("*")
@RequestMapping("compare")
public class MutiCompareController {

	private ChartPriceMapper mapper;
	
	@Autowired
	private MutiCompareController(ChartPriceMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("company/muticompare")
	private void compareMutiCompany() {
		
	}
}
