package com.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午4:45:22
 * @描述
 */
@RestController
public class IndexController {

	@RequestMapping("/start")
	public String hello() {
		return "Hello,Spring Boot !";
	}
}
