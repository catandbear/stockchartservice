package com.fsd2020.controller.companycompare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.muticompany.MutiCompanyInputEntity;
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
	
	//{"name1":"company1", "name2":"company2", "startTime": "2020-05-3 12:33", "endTime": "2020-05-3 12:33"}
	@GetMapping("company/muticompare")
	private void compareMutiCompany(MutiCompanyInputEntity companies) {
		
		System.out.println(companies.toString());
		String companyCode1 = mapper.getCompanyCode(companies.getCompany1());
		String companyCode2 = mapper.getCompanyCode(companies.getCompany2());

		
	}
}
