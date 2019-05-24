/*package com.tz.obiu.test.test;


import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.tz.obiu.test.domain.CountTimeUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaListenerTest {
	@Autowired
	CountTimeUtil sleepUtil;
	
	@KafkaListener(id="123",topicPartitions= {@TopicPartition(topic="kafkaTest", partitions= {"1","2","3","4","0"})})
	public void listener1(List<ConsumerRecord<String, String>> crs, Acknowledgment ack) {
		ack.acknowledge();
		Long startTime = null;
		for (ConsumerRecord<String, String> cr : crs) {
			if (cr.key().equals("0")) {
				startTime = System.currentTimeMillis();
			}
			log.info("partition:{},key:{},value:{}",cr.partition(),cr.key(),cr.value());
//			sleepUtil.sleep("as");
			if (cr.key().equals("799")) {
				Long endTime = System.currentTimeMillis();
				long time = endTime - startTime;
				System.out.println(endTime - startTime);
				log.info("耗时{}",String.valueOf(time));
			}
			
		}
	
	}
	
}
*/