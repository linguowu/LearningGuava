package com.lgw.usageStrings;

import com.google.common.base.Strings;
/**
 * 
 * @author linguowu
 *Strings�������ܣ�
 *1��
 */
public class StringsUsage {
	/**
	 * ��ָ�����ַ���ĩβ���ָ�����ַ���ʹ���ܳ���Ϊָ���ĳ��ȣ�
	 * ���ָ�����ַ�������С��ָ���ĳ��ȣ���ӵ�ָ���ĳ��ȣ�
	 * ���ָ�����ַ������ȴ���ָ���ĳ��ȣ������
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
	 * �ַ���������ʱ����nullToEmpty����������ò���Ϊ�գ�ת���ɿ��ִ�
	 * 
	 * @param para
	 * @return
	 */
	public static String stringNullToEmpty(String para) {
		return Strings.nullToEmpty(para);
	}
	/**
	 * �ж��ַ����Ƿ�Ϊ�ջ���Ϊnull
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
