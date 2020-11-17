package com.attin.fp3functionalInterfaces;

import java.util.List;
import java.util.function.Supplier;

public class FI08MethodReference {

	private static void print(String string) {
		System.out.println(string);

	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "API", "Microservices", "AWS", "PCF", "Azure", "Spring Boot", "Docker",
				"Kubernetes");

		courses.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

		courses.stream().map(String::toUpperCase).forEach(FI08MethodReference::print);

		Supplier<String> supplier = String::new;
	}

}
