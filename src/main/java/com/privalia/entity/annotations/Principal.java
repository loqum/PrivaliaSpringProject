package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext contextAnnotation =  new AnnotationConfigApplicationContext()) {
			
			contextAnnotation.scan("com.privalia.entity.annotations");
			contextAnnotation.refresh();
			
			Student student = contextAnnotation.getBean(Student.class);
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
