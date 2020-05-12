package com.fsd2020.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.fsd2020.data.entity.CompareInputEntity;
import com.fsd2020.data.entity.singlecompany.PriceReturnEntity;

@Mapper
@Repository
public interface ChartPriceMapper {

	List<PriceReturnEntity> getPrice1(CompareInputEntity single);
	List<PriceReturnEntity> getPrice2(CompareInputEntity single);

	String getCompanyCode(String companyName);
}
