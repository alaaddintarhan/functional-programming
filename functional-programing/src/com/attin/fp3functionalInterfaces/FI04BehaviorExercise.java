package com.attin.fp3functionalInterfaces;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Function;

public class FI04BehaviorExercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		/*
		 * first way
		 */
		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, Integer> cubeFunction = x -> x * x * x;

		List<Integer> squaredNumbers = mapAndCreateNewList(numbers, squareFunction);
		List<Integer> cubedNumbers = mapAndCreateNewList(numbers, cubeFunction);
		List<Integer> doubledNumbers = mapAndCreateNewList(numbers, cubeFunction);

		/*
		 * second way
		 */
		squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);
		cubedNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
		doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);

	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> function) {
		return numbers.stream().map(function).collect(toList());
	}

	/*
	 * private static void filterAndPrint(List<Integer> numbers, Predicate<? super
	 * Integer> predicate) {
	 * numbers.stream().filter(predicate).forEach(System.out::println); }
	 */
}
