package com.attin.fp02streams;

import java.util.Comparator;
import java.util.List;

public class S05Comparators {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "API", "Microservices", "AWS", "PCF", "Azure", "Spring Boot", "Docker",
				"Kubernetes");

		System.out.println("\n**** Natural Order ******");
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		System.out.println("\n***** Reverse Order *****");
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("\n***** Comparing Function *****");
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

}
