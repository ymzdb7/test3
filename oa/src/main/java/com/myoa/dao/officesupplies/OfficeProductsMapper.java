package com.myoa.dao.officesupplies;

import com.myoa.model.officesupplies.OfficeProducts;
import com.myoa.model.officesupplies.OfficeProductsExample;
import com.myoa.model.officesupplies.OfficeProductsWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface OfficeProductsMapper {
	public abstract int countByExample(
			OfficeProductsExample paramOfficeProductsExample);

	public abstract int deleteByExample(
			OfficeProductsExample paramOfficeProductsExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs);

	public abstract int insertSelective(
			OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs);

	public abstract List<OfficeProductsWithBLOBs> selectByExampleWithBLOBs(
			OfficeProductsExample paramOfficeProductsExample);

	public abstract List<OfficeProducts> selectByExample(
			OfficeProductsExample paramOfficeProductsExample);

	public abstract OfficeProductsWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs,
			@Param("example") OfficeProductsExample paramOfficeProductsExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs,
			@Param("example") OfficeProductsExample paramOfficeProductsExample);

	public abstract int updateByExample(
			@Param("record") OfficeProducts paramOfficeProducts,
			@Param("example") OfficeProductsExample paramOfficeProductsExample);

	public abstract int updateByPrimaryKeySelective(
			OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs);

	public abstract int updateByPrimaryKey(OfficeProducts paramOfficeProducts);

	public abstract void deleteOfficeProducts(
			@Param("proIds") String[] paramArrayOfString);

	public abstract List<OfficeProductsWithBLOBs> selectOfficeProducts(
			Map<String, Object> paramMap);

	public abstract OfficeProductsWithBLOBs selectSingleOfficeProducts(
			OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs);

	public abstract List<OfficeProductsWithBLOBs> selectDownObject(
			String paramString);

	public abstract OfficeProductsWithBLOBs selByDepoAndTypeAndPro(
			OfficeProductsWithBLOBs paramOfficeProductsWithBLOBs);
}
