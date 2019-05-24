package com.tz.obiu.test.domain;



import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CountTimeUtil {
	public void time(String type) {
		log.info(type+"时间{}",System.currentTimeMillis());
	}
}
