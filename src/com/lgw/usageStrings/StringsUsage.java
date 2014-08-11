package com.lgw.usageStrings;

import com.google.common.base.Strings;
/**
 * 
 * @author linguowu
 *Strings方法汇总：
 *1，
 */
public class StringsUsage {
	/**
	 * 给指定的字符串末尾添加指定的字符，使其总长度为指定的长度，
	 * 如果指定的字符串长度小于指定的长度，添加到指定的长度，
	 * 如果指定的字符串长度大于指定的长度，不添加
	 * @param wantPad
	 * @param length
	 * @param character
	 * @return
	 */
	public static String stringPad(String wantPad, int length,
			Character character) {
		wantPad = stringNullToEmpty(wantPad);
		return Strings.padEnd(wantPad, length, character);
	}

	/**
	 * 字符串当参数时，用nullToEmpty方法，如果该参数为空，转化成空字串
	 * 
	 * @param para
	 * @return
	 */
	public static String stringNullToEmpty(String para) {
		return Strings.nullToEmpty(para);
	}
	/**
	 * 判断字符串是否为空或者为null
	 * @param para
	 * @return
	 */
	public static boolean isNullOrEmpty(String para){
		return Strings.isNullOrEmpty(para);
	}
	public static String findCommonPrefix(String a,String b){
		return Strings.commonPrefix(a, b);
	}
}
