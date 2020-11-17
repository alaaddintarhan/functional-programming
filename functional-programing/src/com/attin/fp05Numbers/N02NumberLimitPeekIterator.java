package com.attin.fp05Numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class N02NumberLimitPeekIterator {

	public static void main(String[] args) {

		IntStream intRange = IntStream.range(1, 10);// => {1,2,3,4,5,6,7,8,9}
		System.out.printf("\nIntStream.range.sum : %d", intRange.sum());

		IntStream intRangeClosed = IntStream.rangeClosed(1, 10);// => {1,2,3,4,5,6,7,8,9,10}
		System.out.printf("\nIntStream.rangeClosed.sum : %d", intRangeClosed.sum());

		int itSum = IntStream.iterate(1, v -> v + 2).limit(10).sum();
		System.out.printf("\nIntStream.iterate.limit.sum : %d", itSum);

		System.out.print("\nIntStream.iterate.limit.peek \n");
		/*
		 * int sum = IntStream.iterate(4, new IntUnaryOperator() {
		 * 
		 * @Override public int applyAsInt(int operand) {
		 * System.out.print("operand value: " + operand); return operand + operand; }
		 * }).limit(4).peek(value -> { System.out.println(",   peeked value :" + value);
		 * }).sum(); System.out.println("sum : "+sum);
		 */

		int sum = IntStream.iterate(4, c -> c + c).limit(4).peek(System.out::println).sum();
		System.out.println("2- sum : " + sum);

		List< Integer > number = IntStream.iterate(4, c -> c + c).limit(4).boxed().collect(Collectors.toList());
		System.out.println("stream.boxed : " + number);
	}
}
