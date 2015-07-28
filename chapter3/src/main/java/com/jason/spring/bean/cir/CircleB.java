package com.jason.spring.bean.cir;

public class CircleB {
	private CircleC circleC;

	public void setCircleC(CircleC circleC) {
		this.circleC = circleC;
	}

	public CircleB(CircleC circleC) {
		this.circleC = circleC;
	}

	public CircleB() {
	}

	public void b() {
		circleC.c();
	}
}
