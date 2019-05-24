package com.tz.obiu.test.strategy;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContextSpringFactory {
	@Autowired
	private Map<String, Strategy> stgMap;
	
	public String doAction(String type) {
		Strategy strategy = this.stgMap.get(type);
		return strategy.action();
	}
}
