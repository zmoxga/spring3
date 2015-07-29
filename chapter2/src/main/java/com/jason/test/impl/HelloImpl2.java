package com.jason.test.impl;

import com.jason.test.HelloApi;

/**
 * Created by jason on 15/7/6.
 */
public class HelloImpl2 implements HelloApi {
  private String message;

  public HelloImpl2() {
    System.out.println("初始化HelloImpl2");
    this.message = "Hello World!";
  }

  public HelloImpl2(String message) {
    this.message = message;
  }

  public void sayHello() {
    System.out.println(message);
  }
}
