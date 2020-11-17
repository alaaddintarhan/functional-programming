package com.attin.fp01Introduction;

import java.util.List;

public class I02Exercises {

	public static void main(String[] args) {


		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		printAllCourses(courses);
		printCourseContainsSpring(courses);
		printCoursesMinLength4(courses);

		List<Integer> number = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		printOddNumbers(number);
		printCubesOfOddNumbers(number);
	}

	private static void printCubesOfOddNumbers(List<Integer> number) {
		printStars();

		number.stream() // convert to stream
				.filter(x -> x%2 !=2) //Lamda Expression
				.map(k -> k*k*k)
				.forEach(System.out::println);
	}

	private static void printOddNumbers(List<Integer> number) {
		printStars();

		number.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
	}

	private static void printAllCourses(List<String> courses) {
		printStars();

		courses.stream() // convert to stream
				.forEach(System.out::println); // Method Reference
	}

	private static void printCourseContainsSpring(List<String> courses) {
		printStars();

		courses.stream()// convert to stream
				.filter(x -> x.contains("Spring")) // Lamda Expresion
				.forEach(System.out::println); // Method Reference
	}

	private static void printCoursesMinLength4(List<String> courses) {
		printStars();

		courses.stream() // convert to stream
				.filter(x -> x.length() >= 4) // Lamda Expression
				.forEach(System.out::println); // Method Reference
	}

	private static void printStars() {
		System.out.println("************");
	}

}
