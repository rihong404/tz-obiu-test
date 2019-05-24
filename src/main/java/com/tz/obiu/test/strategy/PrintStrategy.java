package com.tz.obiu.test.strategy;

import org.springframework.stereotype.Component;

@Component("print")
public class PrintStrategy implements Strategy{

	@Override
	public String action() {
		// TODO Auto-generated method stub
		
		return "打印";
	}

}
