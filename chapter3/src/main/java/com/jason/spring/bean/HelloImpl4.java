package com.jason.spring.bean;

import com.jason.test.HelloApi;

import java.util.List;

public class HelloImpl4 implements HelloApi {

  private List<String> names;

  @Override
  public void sayHello() {
    for (String name : names) {
      System.out.println("Hello " + name);
    }
  }

  public void setNames(List<String> names) {
    this.names = names;
  }
}
