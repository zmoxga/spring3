package com.jason.spring.bean.cir;

public class CircleB {
  private CircleC circleC;

  public CircleB(CircleC circleC) {
    this.circleC = circleC;
  }

  public CircleB() {
  }

  public void setCircleC(CircleC circleC) {
    this.circleC = circleC;
  }

  public void b() {
    circleC.c();
  }
}
