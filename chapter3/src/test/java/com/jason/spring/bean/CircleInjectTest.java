package com.jason.spring.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleInjectTest {
	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testCircleByConstructor() throws Throwable {
		try {
			new ClassPathXmlApplicationContext("circleInjectByConstructor.xml");
		} catch (Exception e) {
			//因为要在创建circle3时抛出；
			e.printStackTrace();
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}
	}

	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testCircleBySetterAndPrototype() throws Throwable {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					"circleInjectBySetterAndPrototype.xml");
			System.out.println(ctx.getBean("circleA"));
		} catch (Exception e) {
			e.printStackTrace();
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}
	}
}
