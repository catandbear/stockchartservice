package com.fsd2020.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.SingleCompareEntity;
import com.fsd2020.data.entity.StockPriceEntity;
import com.fsd2020.data.mapper.StockPriceMapper;

@RestController
@RequestMapping("compare")
public class SingleCompareController {

	private StockPriceMapper mapper;

	@Autowired
	private SingleCompareController(StockPriceMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("company/single")
	public void addPrice(@RequestBody(required = true) SingleCompareEntity singleCompare) {
		System.out.println(singleCompare.toString());
	}

	// insert price function
	/*
	 * private void dateTool() {
	 * 
	 * long startTime = 1577808000000l; long endTime = 1578412800000l;
	 * 
	 * System.out.println((endTime - startTime)/60000);
	 * 
	 * List<StockPriceEntity> list = new ArrayList<>(); for (long start = startTime;
	 * start < endTime; start = start+60000) {
	 * 
	 * if (list.size()<500) { list.add(new StockPriceEntity("9527","BSE",
	 * random(200.00f, 650.00f), new Timestamp(start))); }else {
	 * mapper.addPrice(list); list.clear(); } } System.out.println("for done");
	 * mapper.addPrice(list); list.clear(); System.out.println("all done"); }
	 * 
	 * // 生成 begin 到 end 之间的随机数 private String random(float begin, float end){ float
	 * rtn = begin + (float)(Math.random()*(end - begin)); if (rtn == begin || rtn
	 * == end){ return random(begin, end); } return String.format("%.2f", rtn); }
	 */
}
