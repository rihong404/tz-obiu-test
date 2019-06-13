package com.tz.obiu.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JunitTest {
	@Test
	public void test() {
		System.out.println("测试哈哈哈");
	}
	
	@Before
	public void before() {
		System.out.println("就是比test先");
	}
	
	@After
	public void after() {
		System.out.println("test后才到我");
	}
}
