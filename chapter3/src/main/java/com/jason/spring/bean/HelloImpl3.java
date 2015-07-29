package com.jason.spring.bean;

import com.jason.test.HelloApi;

public class HelloImpl3 implements HelloApi {
  private int index;
  private String message;

  public HelloImpl3() {

  }

  public HelloImpl3(int index, String message) {
    this.index = index;
    this.message = message;
  }

  public void sayHello() {
    System.out.println(index + ":" + message);
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
