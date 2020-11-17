package com.attin.fp02streams;

import com.attin.PrintOutUtil;

import java.util.List;

public class S03MapFilterAndReduce {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);


		Integer sum = numbers.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
		PrintOutUtil.print("SumOfEvenNumbers : %d", sum);

		Integer sum2 = numbers.stream().filter(x -> x % 2 == 1).reduce(0, Integer::sum);
		PrintOutUtil.print("SumOfOddNumbers : %d", sum2);

		Integer sum3 = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
		PrintOutUtil.print("The Sum of Squares Of the Numbers : %d", sum3);

		Integer sum4 = numbers.stream().reduce(0, (x, y) -> (x * x) + (y * y));
		PrintOutUtil.print("The Sum of Squares Of  Aggregate Numbers : %d", sum4);
	}

}
