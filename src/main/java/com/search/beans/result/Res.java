package com.search.beans.result;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午2:57:30
 * @描述
 */
public class Res extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public Res() {
		put("code", 0);
	}

	public static Res error() {
		return error(500, "未知异常，请联系管理员");
	}

	public static Res error(String msg) {
		return error(500, msg);
	}

	public static Res error(int code, String msg) {
		Res r = new Res();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static Res ok(String msg) {
		Res r = new Res();
		r.put("msg", msg);
		return r;
	}

	public static Res ok(Map<String, Object> map) {
		Res r = new Res();
		r.putAll(map);
		return r;
	}

	public static Res ok() {
		return new Res();
	}

	public Res put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
