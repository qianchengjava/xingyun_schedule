package com.xingyun.schedule.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-7-10
 * qiancheng
 */
public class QuartzDemo {
	
	public void sayHi(){
		System.out.println("hi...");
	}
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classpath:config/applicationContext2.xml");
	}
}
