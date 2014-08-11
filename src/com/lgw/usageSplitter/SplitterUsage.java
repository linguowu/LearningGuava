package com.lgw.usageSplitter;

import java.util.List;

import com.google.common.base.Splitter;

/**
 * 
 * Splitter.on('|').split("foo|bar|baz"); Splitter splitter =
 * Splitter.on("\\d+");
 */
public class SplitterUsage {
	public static List<String> splitterCheckEmpty(String s, String delimiter) {
		List<String> lists = Splitter.on(delimiter).trimResults()
				.omitEmptyStrings().splitToList(s);
		return lists;
	}

	public static List<String> splitterNoCheckEmpty(String s, String delimiter) {
		Splitter splitter = Splitter.on('|');
		List<String> list = splitter.splitToList(s);
		return list;
	}
}
