package com.jason.spring.bean;

import com.jason.test.HelloApi;

public class HelloApiDecorator implements HelloApi {
	private HelloApi helloApi;

	public HelloApiDecorator() {

	}

	public HelloApiDecorator(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	@Override
	public void sayHello() {
		System.out.println("--------------------------");
		helloApi.sayHello();
		System.out.println("--------------------------");
	}

	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}
}
