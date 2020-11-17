package com.attin.fp01Introduction;

import java.util.List;

public class I01Functional {

	public static void main(String[] args) {
		printAllNumbers(List.of(12, 9, 8, 7, 8, 3, 4, 98));
	}

	static void printAllNumbers(List<Integer> numbers) {
		// numbers.stream().filter(FP01Functional::isEven).forEach(FP01Functional::print);


		numbers.stream().filter(n -> n % 2 == 0) 	//Lamda expression
				.forEach(x -> System.out.println(x));
	}

	private static void print(Integer num) {
		System.out.println(num);
	}

	private static boolean isEven(Integer num) {
		return num % 2 == 0;
	}
}
