package com.myoa.dao.salary.bonusmsg;

import com.myoa.model.salary.bonusmsg.BonusMsg;
import com.myoa.model.salary.bonusmsg.BonusMsgExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface BonusMsgMapper {
	public abstract int countByExample(BonusMsgExample paramBonusMsgExample);

	public abstract int deleteByExample(BonusMsgExample paramBonusMsgExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(BonusMsg paramBonusMsg);

	public abstract int insertSelective(BonusMsg paramBonusMsg);

	public abstract List<BonusMsg> selectByExample(
			BonusMsgExample paramBonusMsgExample);

	public abstract BonusMsg selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") BonusMsg paramBonusMsg,
			@Param("example") BonusMsgExample paramBonusMsgExample);

	public abstract int updateByExample(
			@Param("record") BonusMsg paramBonusMsg,
			@Param("example") BonusMsgExample paramBonusMsgExample);

	public abstract int updateByPrimaryKeySelective(BonusMsg paramBonusMsg);

	public abstract int updateByPrimaryKey(BonusMsg paramBonusMsg);

	public abstract int inserMsg(Map<String, Object> paramMap);

	public abstract List<BonusMsg> queryBo(Map<String, Object> paramMap);

	public abstract List<BonusMsg> queryBo2(Map<String, Object> paramMap);
}
