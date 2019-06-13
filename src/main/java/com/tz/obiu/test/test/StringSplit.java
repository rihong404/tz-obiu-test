package com.tz.obiu.test.test;

public class StringSplit {
	public static void test() {
		String hh = "地址：暗示大家大声道\n   dadada";
		hh = hh.replace(" ", "&nbsp");
		String [] result = hh.split("\\n");
		System.out.println(result[1].toString());
	}
}
