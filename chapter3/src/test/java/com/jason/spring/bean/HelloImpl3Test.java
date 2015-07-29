package com.jason.spring.bean;

import com.jason.test.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloImpl3Test {

  String springContextXml = "applicationContext.xml";

  @Test
  public void testSayHello() throws Exception {
    BeanFactory beanFactory = new ClassPathXmlApplicationContext(springContextXml);
    HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
    HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
    HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
    HelloApi byFactory = beanFactory.getBean("byFactory", HelloApi.class);
    byIndex.sayHello();
    byType.sayHello();
    byName.sayHello();
    byFactory.sayHello();
  }
}