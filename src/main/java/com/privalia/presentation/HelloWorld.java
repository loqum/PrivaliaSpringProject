package com.privalia.presentation;

public class HelloWorld {

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
