package com.jason.spring.bean;

import com.jason.spring.bean.col.CollectionBean;
import com.jason.spring.bean.col.ListBean;
import com.jason.test.HelloApi;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	@Test
	public void testListInject() {
		BeanFactory factory = new ClassPathXmlApplicationContext("listInject.xml");
		ListBean listBean = factory.getBean("listBean", ListBean.class);
		System.out.println(listBean.getValues().size());
		Assert.assertEquals(3, listBean.getValues().size());
	}

	@Test
	public void tesCollectionInject() {
		BeanFactory factory = new ClassPathXmlApplicationContext("listInject.xml");
		CollectionBean setBean = factory.getBean("setBean", CollectionBean.class);
		System.out.println(setBean.getValues().size());
		Assert.assertEquals(4, setBean.getValues().size());
	}

	@Test
	public void testLookup() {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("lookupMethodInject.xml");
		System.out.println("=======singleton sayHello======");
		HelloApi helloApi1 = context.getBean("helloApi1", HelloApi.class);
		helloApi1.sayHello();
		helloApi1 = context.getBean("helloApi1", HelloApi.class);
		helloApi1.sayHello();
		System.out.println("=======prototype sayHello======");
		HelloApi helloApi2 = context.getBean("helloApi2", HelloApi.class);
		helloApi2.sayHello();
		helloApi2 = context.getBean("helloApi2", HelloApi.class);
		helloApi2.sayHello();
	}

	@Test
	public void testMethodReplacer(){
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("lookupMethodInject.xml");
		Printer printer =context.getBean("printer",Printer.class);
		printer.print("我将被替换");

	}
}
