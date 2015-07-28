package com.jason.spring.bean.cir;

public class CircleC {
	CircleA circleA;

	public CircleC() {
	}

	public CircleC(CircleA circleA) {
		this.circleA = circleA;
	}

	public void c() {
		circleA.a();
	}

	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
}
