package com.fsd2020.data.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SingleCompareEntity {

	private String name;
	private Timestamp startTime1;
	private Timestamp endTime1;
	private Timestamp startTime2;
	private Timestamp endTime2;
}
