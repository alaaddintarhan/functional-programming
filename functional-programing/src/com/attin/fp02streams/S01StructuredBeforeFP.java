package com.attin.fp02streams;

import java.util.List;

public class S01StructuredBeforeFP {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		int sum = addAllNumbers(numbers);

		System.out.println(sum);
	}

	static int addAllNumbers(List<Integer> numbers) {

		/* first */
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;

	 
	}

 

}
