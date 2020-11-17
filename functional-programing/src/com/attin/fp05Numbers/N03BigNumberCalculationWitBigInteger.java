package com.attin.fp05Numbers;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class N03BigNumberCalculationWitBigInteger {

	public static void main(String[] args) {

		System.out.println(" range : " + IntStream.rangeClosed(1, 50).reduce(1, (x, y) -> x * y)); // result is 0
																									// because first
																									// number is x =0

		System.out.println(" range : " + LongStream.rangeClosed(1, 50).reduce(1, (x, y) -> x * y)); // returns negativeValue

		// Solution : convert to Object by using mapToObj
		System.out.println(" range : " + LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply));
	}
}
