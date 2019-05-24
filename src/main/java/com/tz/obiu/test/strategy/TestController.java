package com.tz.obiu.test.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	ContextSpringFactory factory;
	
	@GetMapping("/doAction")
	public String action() {
		String result = factory.doAction("print");
		return result;
	}
}
