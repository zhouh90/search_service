package com.search.crawler;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.beans.bizs.IDCardLoation;
import com.search.beans.result.crawler.CrawlerResult;
import com.search.mapper.IDCardLocationMapper;
import com.search.utils.CommonUtils;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午4:47:01
 * @描述
 */
@Service
public class CrawlerIDCardLocationService {

	@Autowired
	private IDCardLocationMapper idCardLocationMapper;

	public CrawlerResult searchIDCardLocation(String idCard) {
		CrawlerResult result = new CrawlerResult();
		if (StringUtils.isBlank(idCard) || idCard.trim().length() < 6 || !CommonUtils.isNumber(idCard)) {
			result.setCode(CrawlerResult.FAIL_CODE);
			result.setMsg("【idCard】必须是不小于6位的数字");
			return result;
		}
		IDCardLoation idCardLoation = idCardLocationMapper.getByIDCard(idCard);
		if (idCardLoation != null) {
			result.setCode(CrawlerResult.SUCCESS_CODE);
			result.setMsg("查询成功");
			result.setCrawlerResult(idCardLoation);
			return result;
		}
		result.setCode(CrawlerResult.FAIL_CODE);
		result.setMsg("未查到结果");
		return result;
	}

}
