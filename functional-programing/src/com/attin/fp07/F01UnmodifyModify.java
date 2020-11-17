package com.attin.fp07;

import java.util.ArrayList;
import java.util.List;

public class F01UnmodifyModify {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Kubernetes");

		/**
		 * UnsupportedOperationException at
		 * java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:71)
		 */
		try {
			courses.replaceAll(String::toUpperCase);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}

		List<String> modifyableCourses = new ArrayList(courses);

		// it can be modify elements of the course list
		modifyableCourses.replaceAll(String::toUpperCase);
		// modifyableCourses.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println(modifyableCourses);

		modifyableCourses.removeIf(course -> course.length() > 8);
		System.out.printf("\n removed if  course length is greater than 8 : %s",modifyableCourses);

	}
}
