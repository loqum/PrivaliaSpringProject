package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {

	@Autowired
	@Value("Hello World From Annotations!")
	private String hello;

	public HelloWorld() {

	}

	public HelloWorld(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
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
