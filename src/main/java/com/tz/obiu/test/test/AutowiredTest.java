package com.tz.obiu.test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AutowiredTest{
	@Autowired
	protected AutowiredBeanTest autowiredBeanTest;
	
	public void test() {
		System.out.println("父类：" + this.toString());
		autowiredBeanTest.setType("高级员工");
	}
}
