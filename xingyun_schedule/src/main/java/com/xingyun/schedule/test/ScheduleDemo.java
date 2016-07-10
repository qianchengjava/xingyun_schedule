package com.xingyun.schedule.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 2016-7-10
 * qiancheng
 */
@Component
public class ScheduleDemo {
	@Scheduled(fixedRate=1000)
	public void sayHello(){
		System.out.println("hello...");
	}
//	public static void main(String[] args) {
//		new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
//	}
}
