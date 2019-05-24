package com.tz.obiu.test.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import freemarker.template.TemplateException;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class ValueTest {
	@Value("haha")
	public String name;
	
//	@Value("classpath:/templates/printConfig.properties")
//	Resource path;
	
	public void testValue() {
//		ResourceBundle resource = null;
//		try {
//			resource = new PropertyResourceBundle(new FileInputStream(path.getFile()));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		log.info("测试：{}",resource.getString("billDeliverTemplate"));
//		System.out.println(resource.getString("billDeliverTemplate"));
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "Mark");
		map.put("sex", "man");
		map.put("num", "3");
		map.put("score", "100");
		try {
			String s = FreemarkerUtil.getTemplate("billDeliverTemplate.html",map);
			log.info("模板：{}",s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
