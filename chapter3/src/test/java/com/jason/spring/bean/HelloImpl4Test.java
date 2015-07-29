package com.jason.spring.bean;

import com.jason.test.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloImpl4Test {
  String springContextXml = "applicationContext.xml";

  @Test
  public void testSayHello() throws Exception {
    BeanFactory beanFactory = new ClassPathXmlApplicationContext(springContextXml);
    HelloApi hello4 = beanFactory.getBean("hello4", HelloApi.class);
    hello4.sayHello();

  }
}