package com.fsd2020.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MutiInputEntity {

	private String name1;
	private String code1;
	private String name2;
	private String code2;
	private String startTime;
	private String endTime;
}
