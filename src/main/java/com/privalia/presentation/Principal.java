package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//		HelloWorld helloWorldConst = (HelloWorld) context.getBean("helloWorldConst");
//
//		System.out.println(helloWorld.getHello());
//		System.out.println(helloWorldConst.getHello());
		
		Alumno alumno = (Alumno) context.getBean("alumno");
		System.out.println(alumno.toString());

		context.close();

	}

}
