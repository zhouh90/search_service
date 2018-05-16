package com.search.utils;

public class UtilFunction {
	public final static String REGION_NAME_SH = "SH";

	/**
	 * name的值为null或者""返回true否则返回false;
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public static boolean isEmpty(String name) {
		if (name == null || "".equals(name)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * name的值不为null或者""返回true否则返回false;
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public static boolean isNotEmpty(String name) {
		if (name == null || "".equals(name)) {
			return false;
		} else {
			return true;
		}
	}

}
