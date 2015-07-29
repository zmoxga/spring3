package com.jason.spring.bean.scope;

import java.util.HashMap;
import java.util.Map;

public class SingletonBeanRegister {
  private final Map<String, Object> BEANS = new HashMap<String, Object>();

  public boolean containsBean(String beanName) {
    return BEANS.containsKey(beanName);
  }

  public Object getSingleton(String beanName) {
    return BEANS.get(beanName);
  }

  public int getSingletonCount() {
    return BEANS.size();
  }

  public String[] getSingletonName() {
    return BEANS.keySet().toArray(new String[0]);
  }

  public void registerSingletonBean(String beanName, Object obj) {
    if (BEANS.containsKey(beanName)) {
      throw new RuntimeException("[" + beanName + "]已存在实例化单例对象");
    }
    BEANS.put(beanName, obj);
  }
}
