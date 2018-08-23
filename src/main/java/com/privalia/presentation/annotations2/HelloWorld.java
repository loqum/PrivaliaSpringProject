package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {

	private String hello;

	public String getHello() {
		return hello;
	}
	
	@Autowired
	@Value("Hello World From Annotations2!")
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld() {
	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HelloWorld [hello=");
		builder.append(hello);
		builder.append("]");
		return builder.toString();
	}

}
