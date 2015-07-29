package com.jason.spring.bean;

import com.jason.test.HelloApi;

public abstract class HelloImpl5 implements HelloApi {
  private Printer printer;

  @Override
  public void sayHello() {
    printer.print("setter");
    createPrototypePrinter().print("prototype");
    createSingletonPrinter().print("singleton");
  }

  public abstract Printer createPrototypePrinter();

  public Printer createSingletonPrinter() {
    System.out.println("该方法不会被执行,执行就出错了");
    return new Printer();
  }

  public void setPrinter(Printer printer) {
    this.printer = printer;
  }
}
