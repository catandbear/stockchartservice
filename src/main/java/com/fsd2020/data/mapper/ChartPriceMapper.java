package com.fsd2020.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.fsd2020.data.entity.singleCompare.InputEntity;
import com.fsd2020.data.entity.MutiInputEntity;
import com.fsd2020.data.entity.singleCompare.PriceReturnEntity;

@Mapper
@Repository
public interface ChartPriceMapper {
	
	String getCompanyCode(String companyName);
	
	// Single Company Compare
	List<PriceReturnEntity> getSingleCompanyPrice(String code, String start, String end);
	List<PriceReturnEntity> getPrice1(InputEntity single);
	List<PriceReturnEntity> getPrice2(InputEntity single);
	
	// Muti company compare
	List<PriceReturnEntity> getMutiCompanyPrice1(MutiInputEntity entity);
	List<PriceReturnEntity> getMutiCompanyPrice2(MutiInputEntity entity);

	// Single Sector Compare
	// get times
	List<PriceReturnEntity> getSingleSectorPrice(String name, String start, String end);
}
