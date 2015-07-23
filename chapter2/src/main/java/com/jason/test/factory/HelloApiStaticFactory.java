package com.jason.test.factory;

import com.jason.test.HelloApi;
import com.jason.test.impl.HelloImpl2;

public class HelloApiStaticFactory {
	public static HelloApi newInstance(String message){
		return new HelloImpl2(message);
	}
}
