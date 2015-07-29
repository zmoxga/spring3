package com.jason.spring.bean.scope;

public class DefaultBeanFactory {
  private final SingletonBeanRegister SINGLETONS = new SingletonBeanRegister();
  private BeanDefinitionRegister DEFINITIONS = new BeanDefinitionRegister();

  public Object getBean(String beanName) {
    if (!DEFINITIONS.containsBeanDefinition(beanName)) {
      throw new RuntimeException("[" + beanName + "] does not exists!");
    }
    BeanDefinition bd = DEFINITIONS.getBeanDefinition(beanName);
    if (bd.getScope() == BeanDefinition.SCOPE_SINGLETON) {
      if (!SINGLETONS.containsBean(beanName)) {
        SINGLETONS.registerSingletonBean(beanName, createBean(bd));
      }
      return SINGLETONS.getSingleton(beanName);
    }
    if (bd.getScope() == BeanDefinition.SCOPE_PROTOTYPE) {
      return createBean(bd);
    }
    throw new RuntimeException("错误的Bean定义 for " + beanName);
  }

  public void registerBeanDefinition(BeanDefinition bd) {
    DEFINITIONS.registerBeanDefinition(bd.getId(), bd);
  }

  public Object createBean(BeanDefinition bd) {
    try {
      Class clazz = Class.forName(bd.getClazz());
      return clazz.getConstructor().newInstance();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException("没有找到Bean[" + bd.getId() + "]类");
    } catch (Exception e) {
      throw new RuntimeException("创建Bean[" + bd.getId() + "]失败");
    }
  }
}
