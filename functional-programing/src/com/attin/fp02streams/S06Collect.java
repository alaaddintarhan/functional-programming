package com.attin.fp02streams;

import java.util.List;
import java.util.stream.Collectors;

public class S06Collect {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		List<Integer> squareList = doubleList(numbers);
		System.out.println(squareList);

		List<Integer> evenNumbersOnly = evenNumberList(numbers);
		System.out.println(evenNumbersOnly);

		List<String> courses = List.of("Spring", "API", "Microservices", "AWS", "PCF", "Azure", "Spring Boot", "Docker", "Kubernetes");
		List<Integer> courseLengthList = numberLengthList(courses);
		System.out.println(courseLengthList);

	}

	private static List<Integer> numberLengthList(List<String> courses) {
		return  courses.stream().map(x -> x.length()).collect(Collectors.toList());
	}

	private static List<Integer> evenNumberList(List<Integer> numbers) {
		return numbers.stream().filter(x -> x%2==0).map(x -> x* x).collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// 1,5,7
		// 1 -> 1
		// 5 -> 25
		// 7 -> 49

		/** map().collect()
		 * <R, A> R collect(Collector<? super T, A, R> collector); when executed in
		 * parallel with non-thread-safe data structures (such as {@code ArrayList}), no
		 * additional synchronization is needed for a parallel reduction.
		 */
		/** Collectors.toList()
		 * There are no guarantees on the type, mutability,
		 *      * serializability, or thread-safety of the {@code List} returned; if more
		 *      * control over the returned {@code List} is required, use {@link #toCollection(Supplier)}.
		 */
		return numbers.stream().map(x -> x * x).collect(Collectors.toList());
	}

}
