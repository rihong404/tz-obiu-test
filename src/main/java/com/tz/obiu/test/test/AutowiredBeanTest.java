package com.tz.obiu.test.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AutowiredBeanTest {
	
	public static String type;
	@Value("日红")
	public String name;
	
	public String num;
	
	public String age;
	
	@Value("普通员工")
	public void setType(String type) {
		AutowiredBeanTest.type = type;
	}
	
}
