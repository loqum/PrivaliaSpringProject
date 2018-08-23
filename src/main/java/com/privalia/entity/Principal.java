package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml")) {
			Student student = context.getBean(Student.class);
			builder.append(student.getIdStudent())
			.append(" ")
			.append(student.getName())
			.append(" ")
			.append(student.getSurname())
			.append(" ")
			.append(student.getAge())
			.append(" ")
			.append(student.getAddress().getIdAddress())
			.append(" ")
			.append(student.getAddress().getStreet());

			System.out.println(builder.toString());
		}

	}

}
