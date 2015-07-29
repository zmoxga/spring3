package com.jason.spring.bean.scope;

import com.jason.test.impl.HelloImpl2;
import org.junit.Test;

public class BeanScopeTest {

  @Test
  public void testPrototype() {
    DefaultBeanFactory factory = new DefaultBeanFactory();
    BeanDefinition bd = new BeanDefinition();
    bd.setId("bean1");
    bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    bd.setClazz(HelloImpl2.class.getName());
    factory.registerBeanDefinition(bd);
    //两次从工厂类中获得的Bean不同.每次都是新实例
    System.out.println(factory.getBean("bean1") != factory.getBean("bean1"));
  }
}