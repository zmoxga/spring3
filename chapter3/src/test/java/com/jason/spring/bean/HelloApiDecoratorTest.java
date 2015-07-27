package com.jason.spring.bean;

import com.jason.test.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApiDecoratorTest {

	@Test
	public void testSayHello() throws Exception {

		BeanFactory factory = new ClassPathXmlApplicationContext("beanInject.xml");
		HelloApi bean1 = factory.getBean("bean1", HelloApi.class);
		HelloApi bean2 = factory.getBean("bean2", HelloApi.class);
		bean1.sayHello();
		bean2.sayHello();
	}

	@Test
	public void testLocalAndParentBeanInject() throws Exception {

		ApplicationContext parent = new ClassPathXmlApplicationContext("parent/parentBeanInject.xml");
		ApplicationContext local = new ClassPathXmlApplicationContext(new String[]{"parent/localBeanInject.xml"}, parent);
		HelloApi bean1 = local.getBean("bean1", HelloApi.class);
		HelloApi bean2 = local.getBean("bean2", HelloApi.class);
		bean1.sayHello();
		bean2.sayHello();
	}
}