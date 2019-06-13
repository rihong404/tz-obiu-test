package com.tz.obiu.test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredTest1 extends AutowiredTest{
	@Autowired
	AutowiredBeanTest autowiredBeanTest;
	public void test() {
		super.test();
		System.out.println("父类1：" + AutowiredTest1.class.getSuperclass());
	}
}
