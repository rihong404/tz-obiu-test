package com.tz.obiu.test.test;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ListForEach {
	public static String testList() {
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.forEach((s)->{
			log.info("={}",s);
		});
		return null;
	}
}
