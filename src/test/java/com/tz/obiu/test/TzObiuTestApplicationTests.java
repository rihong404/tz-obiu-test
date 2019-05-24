package com.tz.obiu.test;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tz.obiu.test.domain.Cat;
import com.tz.obiu.test.domain.PrintTask;
import com.tz.obiu.test.test.AutowiredTest1;
import com.tz.obiu.test.test.AutowiredBeanTest;
import com.tz.obiu.test.test.AutowiredTest;
import com.tz.obiu.test.test.AutowiredTest2;
import com.tz.obiu.test.test.ValueTest;

import kafka.utils.Json;
import kafka.utils.json.JsonObject;




@RunWith(SpringRunner.class)
@SpringBootTest
public class TzObiuTestApplicationTests {
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	ValueTest test;
	@Autowired
	AutowiredBeanTest autowiredBeanTest;
//	@Autowired
//	AutowiredTest autowiredTest;
	@Autowired
	AutowiredTest1 autowiredTest1;
	@Autowired
	AutowiredTest2 autowiredTest2;
	
	
	@Test
	public void contextLoads() {
		
//		FileReaderTest.readToChar();
//		FileReaderTest.readToCharArray();
//		FileReaderTest.readToBuffReader();
		
//		ListForEach.testList();
		
//		JavaBeanSetGet javaBeanSetGet = new JavaBeanSetGet();
//		javaBeanSetGet.setName("haha");
//		javaBeanSetGet.setSex("nan");
//		System.out.println(javaBeanSetGet.num);
//		System.out.println(javaBeanSetGet.getSex());
		//kafka测试
//		for(int i = 0; i < 100; i=i+5) {
//			kafkaTemplate.send("kafkaTest",0,String.valueOf(i),"你好"+String.valueOf(i));
//			kafkaTemplate.send("kafkaTest",1,String.valueOf(i+1),"你好"+String.valueOf(i+1));
//			kafkaTemplate.send("kafkaTest",2,String.valueOf(i+2),"你好"+String.valueOf(i+2));
//			kafkaTemplate.send("kafkaTest",3,String.valueOf(i+3),"你好"+String.valueOf(i+3));
//			kafkaTemplate.send("kafkaTest",4,String.valueOf(i+4),"你好"+String.valueOf(i+4));
//		}
		
		//打印测试
		for(int i = 0; i < 300; i++) {
			PrintTask task = new PrintTask(null,"xs00001000109", "1911443AY","1", "1");
			kafkaTemplate.send("local.print.printTask",String.valueOf(i),JSON.toJSON(task).toString());
		}
		
		//测试原型模式
//		Cat cat1 = new Cat("皮蛋","灰色", "蹭人");
//		Cat cat2 = null;
//		try {
//			cat2 = cat1.clone();
//			
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		cat2.setName("妞妞");
//		System.out.println("cat1:"+cat1+",cat2:"+cat2);
		
//		test.testValue();
		autowiredTest1.test();
		autowiredTest2.test();
//		autowiredTest1.test();
		System.out.println("员工类型：" + AutowiredBeanTest.type);
		System.out.println("员工姓名：" + autowiredBeanTest.name);
		System.out.println(autowiredBeanTest);
	}

}
