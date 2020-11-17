package com.attin.fp02streams;

import java.util.List;

public class S02 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		int sum = addAllNumbers(numbers);

		System.out.println(sum);
	}

	static int addAllNumbers(List<Integer> numbers) {

		/* first */
		// int sum = 0;
		// for (int num : numbers) {
		// sum += num;
		// }
		// return sum;

		// Stream of number --> One result value
		// Combine them into one result --> One Value
		// 0 and FP02Structured::sum

		/* second */
		// return numbers.stream().reduce(0, FP02Structured::sum);

		/*
		 * thirth // return numbers.stream().reduce(0, (nextNumber, aggregate) ->
		 * aggregate + nextNumber);
		 * 
		 * /*fourth - best practice
		 */

		return numbers.stream().reduce(0, Integer::sum);
	}

	private static Integer sum(Integer aggregate, Integer nextNumber) {
		return aggregate + nextNumber;
	}

}
