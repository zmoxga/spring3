package com.jason.spring.bean.scope;

import java.util.HashMap;
import java.util.Map;

public class BeanDefinitionRegister {
  private final Map<String, BeanDefinition> DEFINITIONS = new HashMap<>();

  public void registerBeanDefinition(String beanName, BeanDefinition bd) {
    if (DEFINITIONS.containsKey(beanName)) {
      throw new RuntimeException("已存在Bean定义，此实现不允许覆盖");
    }
    DEFINITIONS.put(beanName, bd);
  }

  public BeanDefinition getBeanDefinition(String beanName) {
    return DEFINITIONS.get(beanName);
  }

  public boolean containsBeanDefinition(String beanName) {
    return DEFINITIONS.containsKey(beanName);
  }
}
