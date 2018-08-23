package com.privalia.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {
	
	public static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld helloWorld = appContext.getBean(HelloWorld.class);
		
		Alumno alumno = (Alumno) appContext.getBean("alumno");
		
		System.out.println(builder.append(helloWorld.getHello()).append("\n").append(alumno.toString()));
		
		appContext.close();

	}

}
