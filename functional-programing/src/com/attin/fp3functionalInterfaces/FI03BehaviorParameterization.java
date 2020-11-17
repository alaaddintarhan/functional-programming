package com.attin.fp3functionalInterfaces;

import com.attin.PrintOutUtil;

import java.util.List;
import java.util.function.Predicate;

public class FI03BehaviorParameterization {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		//first way
		Predicate<? super Integer> evenPredicate = x -> x % 2 == 0;
		Predicate<? super Integer> oddPredicate = x -> x % 2 != 0;

		filterAndPrint(numbers, oddPredicate);
		filterAndPrint(numbers, evenPredicate);

		//second way
		filterAndPrint(numbers, x -> x % 2 == 0);
		filterAndPrint(numbers, x -> x % 2 != 0);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		System.out.println("*****");

		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}
