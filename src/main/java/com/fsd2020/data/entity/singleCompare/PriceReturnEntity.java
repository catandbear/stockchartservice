package com.fsd2020.data.entity.singleCompare;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;


public class PriceReturnEntity {

	private String price;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public PriceReturnEntity(String price, Timestamp time) {
		super();
		this.price = price;
		this.time = time;
	}
	public PriceReturnEntity() {
		
	}
	@Override
	public String toString() {
		return "PriceReturnEntity [price=" + price + ", time=" + time + "]";
	}
	
	
}
