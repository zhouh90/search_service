package com.search.mapper;

import com.search.beans.bizs.IDCardLoation;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月15日 上午11:21:11
 * @描述
 */
public interface IDCardLocationMapper {

//	@Select("SELECT * FROM IDCARDLOATION WHERE idcard = #{idCard} LIMIT 1")
	public IDCardLoation getByIDCard(String idCard);

}
