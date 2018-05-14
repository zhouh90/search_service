package com.search.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.search.beans.result.Res;
import com.search.beans.result.crawler.CrawlerResult;
import com.search.crawler.CrawlerIDCardLocationService;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午2:53:43
 * @描述
 */

@RestController
@RequestMapping("/seek")
public class SearchController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private CrawlerIDCardLocationService idCardLocationService;

	@RequestMapping("/IDCard_location/{idCard}")
	@ResponseBody
	public Res idCardLocation(@PathVariable String idCard) {
		logger.info("search for 【IDCard_location】   >>>>>> input:{}", idCard);
		CrawlerResult crawlerResult = idCardLocationService.searchIDCardLocation(idCard);
		if (crawlerResult.getCode() == CrawlerResult.SUCCESS_CODE) {
			return Res.ok(crawlerResult.getMsg()).put("result", crawlerResult.getCrawlerResult());
		}
		return Res.error(crawlerResult.getMsg());
	}

}
