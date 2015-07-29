package com.jason.spring.factory;

import com.jason.spring.bean.HelloImpl3;
import com.jason.test.HelloApi;

public class DependencyInjectByStaticFactory {
  public static HelloApi newInstance(int index, String message) {
    return new HelloImpl3(index, message);
  }
}
