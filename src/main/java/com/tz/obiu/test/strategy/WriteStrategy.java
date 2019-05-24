package com.tz.obiu.test.strategy;

import org.springframework.stereotype.Component;

@Component("write")
public class WriteStrategy implements Strategy{

	@Override
	public String action() {
		// TODO Auto-generated method stub
		
		return "写";
	}

}
