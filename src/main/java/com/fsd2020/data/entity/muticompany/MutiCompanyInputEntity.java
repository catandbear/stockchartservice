package com.fsd2020.data.entity.muticompany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MutiCompanyInputEntity {

	private String name1;
	private String name2;
	private String company1;
	private String company2;
	private String startTime;
	private String endTime;
}
