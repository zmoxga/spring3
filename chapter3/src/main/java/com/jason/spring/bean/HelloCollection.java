package com.jason.spring.bean;

import com.jason.test.HelloApi;

import java.util.List;

public class HelloCollection {
  String beanName;
  HelloApi mainHelloApi;
  List<HelloApi> helloApis;

  public List<HelloApi> getHelloApis() {
    return helloApis;
  }

  public void setHelloApis(List<HelloApi> helloApis) {
    this.helloApis = helloApis;
  }

  public HelloApi getMainHelloApi() {
    return mainHelloApi;
  }

  public void setMainHelloApi(HelloApi mainHelloApi) {
    this.mainHelloApi = mainHelloApi;
  }

  public String getBeanName() {
    return beanName;
  }

  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
