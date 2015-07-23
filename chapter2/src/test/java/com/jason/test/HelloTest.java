package com.jason.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	String springContextXml= "applicationContext.xml";

	@Test
	public void testSayHello() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(springContextXml);
		HelloApi helloApi = ctx.getBean("hello", HelloApi.class);
		helloApi.sayHello();
	}

	@Test
	public void testSayHello2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(springContextXml);
		HelloApi helloApi = ctx.getBean("hello2", HelloApi.class);
		helloApi.sayHello();
	}

	@Test
	public void testSayHello3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(springContextXml);
		HelloApi helloApi = ctx.getBean("hello3", HelloApi.class);
		helloApi.sayHello();
	}

	@Test
	public void testSayHello4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(springContextXml);
		HelloApi helloApi = ctx.getBean("hello4", HelloApi.class);
		helloApi.sayHello();
	}
}
