package com.search.beans.result.crawler;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午4:48:57
 * @描述
 */
public class CrawlerResult {

	public static final int SUCCESS_CODE = 1;
	public static final int FAIL_CODE = -1;

	private int code;
	private String msg;
	private Object crawlerResult;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getCrawlerResult() {
		return crawlerResult;
	}

	public void setCrawlerResult(Object crawlerResult) {
		this.crawlerResult = crawlerResult;
	}

}
