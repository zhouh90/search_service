package com.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午3:00:35
 * @描述
 */
@SpringBootApplication
public class RunServer {

	private static final Logger logger = LoggerFactory.getLogger(RunServer.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RunServer.class, args);
		logger.info("the 【search api】 server start success !");
	}

}
