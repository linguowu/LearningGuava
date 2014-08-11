package com.lgw.usagejoiner;

import java.util.List;

import com.google.common.base.Joiner;

/**
 * 
 * Joiner: ����ƴ���ַ���
 * 
 * About Joiner: The Joiner.on("#") call is creating a Joiner object
 */
public class JoinerUsage {
	/**
	 * the common usage
	 * 
	 * @param stringList
	 * @param delimiter
	 * @return
	 */
	public static String commonBuildString(List<String> stringList,
			String delimiter) {
		StringBuilder builder = new StringBuilder();
		for (String s : stringList) {
			if (s != null) {
				builder.append(s).append(delimiter);
			}
		}
		builder.setLength(builder.length() - delimiter.length());
		return builder.toString();
	}

	/**
	 * the Joiner Usage
	 * 
	 * @param stringList
	 * @param delimiter
	 * @return
	 */
	public static String joinerBuildString(List<String> stringList,
			String delimiter) {
		String string = Joiner.on(delimiter).join(stringList);
		return string;
	}

	/**
	 * Joiner handle the null string
	 * 
	 * @return
	 */
	public static void joinerHandleNullString() {

		/** ����Ϊ�յ��ֶ� **/
		Joiner joiner = Joiner.on("&").skipNulls();
		/** ���յ��ֶ����Զ�����ֶδ��� **/
		Joiner joiner2 = Joiner.on("&").useForNull("missing");
		String jonString = joiner.join("foo", "bar", (Object) null);
		System.out.println(jonString);// ��ӡ�����foo&bar
		String jonString2 = joiner2.join("foo", "bar", (Object) null);// ��ӡ�����foo&bar&missing
		System.out.println(jonString2);
	}

	/**
	 * returns the StringBuilder instance with the values foo,bar,baz appeneded
	 * with "|" delimiters
	 */
	public static void joinerAppendTo() {
		StringBuilder stringBuilder = new StringBuilder();
		Joiner joiner = Joiner.on("|").skipNulls();
		joiner.appendTo(stringBuilder, "foo", "bar", "baz");
		System.out.println(stringBuilder.toString());
	}
}
