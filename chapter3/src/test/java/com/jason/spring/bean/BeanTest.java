package com.jason.spring.bean;

import com.jason.spring.bean.col.CollectionBean;
import com.jason.spring.bean.col.ListBean;
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
}