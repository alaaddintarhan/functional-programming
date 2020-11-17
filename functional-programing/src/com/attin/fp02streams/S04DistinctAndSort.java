package com.attin.fp02streams;

import java.util.List;

public class S04DistinctAndSort {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 4, 4, 9);

		System.out.println("\nSortNumbers:");
		numbers.stream().sorted().forEach(System.out::println);

		System.out.println("\nDistinctNumbers:");
		numbers.stream().distinct().forEach(System.out::println);

		System.out.println("\nDistinctAndSortNumbers:");
		numbers.stream().distinct().sorted().forEach(System.out::println);


		List<String> courses = List.of("Spring", "API", "Microservices", "AWS", "PCF", "Azure", "Spring Boot", "Docker","Kubernetes");
		courses.stream().sorted().forEach(System.out::println);
	}


}
