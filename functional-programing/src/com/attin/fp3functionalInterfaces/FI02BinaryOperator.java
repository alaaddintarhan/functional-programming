package com.attin.fp3functionalInterfaces;

import com.attin.PrintOutUtil;

import java.util.List;
import java.util.function.BinaryOperator;

public class FI02BinaryOperator {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		// first way
		int first = numbers.stream().reduce(0, Integer::sum);
		PrintOutUtil.print("first: ", first);

		// second way with BinaryOperator
		//BinaryOperator<Integer> sumBinaryOperation = Integer::sum;
		BinaryOperator<Integer> sumBinaryOperation = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer x, Integer y) {
				return x + y;
			}
		};

		int second = numbers.stream().reduce(0, sumBinaryOperation);
		PrintOutUtil.print("second : ", second);

	}
}
