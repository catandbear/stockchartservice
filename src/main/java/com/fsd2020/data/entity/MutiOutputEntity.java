package com.fsd2020.data.entity;

import java.util.List;

import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class MutiOutputEntity {

	private String name1;
	private String name2;
	List<PriceReturnEntity> price1;
	List<PriceReturnEntity> price2;
}
