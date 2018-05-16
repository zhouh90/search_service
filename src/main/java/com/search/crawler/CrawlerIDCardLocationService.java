package com.search.crawler;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.beans.bizs.IDCardLoation;
import com.search.beans.result.crawler.CrawlerResult;
import com.search.dao.IDCardLoationRepository;
import com.search.utils.CommonUtils;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午4:47:01
 * @描述
 */
@Service
public class CrawlerIDCardLocationService {

//	@Autowired
//	private IDCardLocationMapper idCardLocationMapper;

	@Autowired
	private IDCardLoationRepository idCardLoationRepository;

	public CrawlerResult searchIDCardLocation(String idCard) {
		CrawlerResult result = new CrawlerResult();
		if (StringUtils.isBlank(idCard) || idCard.trim().length() < 6 || !CommonUtils.isNumber(idCard)) {
			result.setCode(CrawlerResult.FAIL_CODE);
			result.setMsg("【idCard】必须是不小于6位的数字");
			return result;
		}
		List<IDCardLoation> list = idCardLoationRepository.findByIdcard(idCard);
		if (!CollectionUtils.isEmpty(list)) {
			result.setCode(CrawlerResult.SUCCESS_CODE);
			result.setMsg("查询成功");
			result.setCrawlerResult(list.get(0));
			return result;
		}
		result.setCode(CrawlerResult.FAIL_CODE);
		result.setMsg("未查到结果");
		return result;
	}

}
