package com.jason.spring.bean;

import com.jason.spring.nav.NavigationA;
import com.jason.spring.nav.NavigationC;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NavigateTest {

	@Test
	public void testNavigationBeanInject() {
		ApplicationContext context = new ClassPathXmlApplicationContext("navigationInject.xml");
		NavigationA navigationA = context.getBean("navigationA", NavigationA.class);
		navigationA.getNavigationB().getNavigationC().sayNavigation();
		navigationA.getNavigationB().getList().get(0).sayNavigation();
		navigationA.getNavigationB().getMap().get("key").sayNavigation();
		navigationA.getNavigationB().getArray()[0].sayNavigation();
		((NavigationC) navigationA.getNavigationB().getProperties().get("1"))
				.sayNavigation();
	}
}
