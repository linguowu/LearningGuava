package com.lgw.main;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.lgw.usageSplitter.SplitterUsage;
import com.lgw.usageStrings.StringsUsage;
import com.lgw.usagejoiner.JoinerUsage;

public class GuavaPractiseMain {

	public static void main(String[] args) {
		/** Joiner用法 Start **/
		ArrayList<String> strings = Lists.newArrayList("1a","2b","3c","4d");
//		strings.add("1");
//		strings.add("2");
//		strings.add("3");
//		strings.add("4");
		String joinerString = JoinerUsage.joinerBuildString(strings, "&");
		String commonString = JoinerUsage.commonBuildString(strings, "&");
		System.out.println(joinerString);
		System.out.println(commonString);
		JoinerUsage.joinerHandleNullString();
		JoinerUsage.joinerAppendTo();
		/** Joiner用法 End **/

		/** Splitter用法 Start **/
		String string = "foo" + "|" + "|" + "bar" + "|" + "" + "|" + "foo";
		List<String> list = SplitterUsage.splitterCheckEmpty(string, "|");
		for (String string2 : list) {
			System.out.println("splitterString:" + string2);
			/**
			 * splitterString:foo splitterString:bar splitterString:foo
			 **/
		}
		List<String> list2 = SplitterUsage.splitterNoCheckEmpty(string, "|");
		for (String string2 : list2) {
			System.out.println("splitterNoCheckEmpty:" + string2);
		}
		/**
		 * splitterNoCheckEmpty:foo splitterNoCheckEmpty:
		 * splitterNoCheckEmpty:bar splitterNoCheckEmpty:
		 * splitterNoCheckEmpty:foo
		 **/
		/** Splitter用法 End **/

		/** Strings用法Start **/
		String s = StringsUsage.stringPad("pad", 7, 'x');
		System.out.println(s);
		/** Strings用法End **/
		String commonPre = StringsUsage.findCommonPrefix("helloworld", "hellochina");
		System.out.println(commonPre);

	}
}
