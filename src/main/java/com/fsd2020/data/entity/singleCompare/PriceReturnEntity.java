package com.fsd2020.data.entity.singleCompare;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PriceReturnEntity {

	private String price;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time;
}
