package com.tz.obiu.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tz.obiu.test.test.AutowiredBeanTest;
import com.tz.obiu.test.test.ValueTest;

@Controller
//@Scope("prototype")
public class ObiuTestController {
	
	@Autowired
	ValueTest valueTest;
	@Autowired
	AutowiredBeanTest BeanTest;
	@Autowired
	ApplicationContext applicationContext;
	
	@RequestMapping("/test")
	public String Test(Map<String,String> map) {
		map.put("name", "Mark");
		map.put("sex", "man");
		map.put("num", "3");
		map.put("score", "100");
//		valueTest.testValue();
		
		System.out.println(BeanTest);
		return "billDeliverTemplate";
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public String test2() {
		System.out.println(applicationContext.getBean("autowiredBeanTest"));
		return "test2";
	}
}
