package com.attin.fp05Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class N01 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 45, 98, 46, 578, 15, 3); // Returns an unmodifiable list containing eight
		// elements.
		System.out.println("\n******** numbers.stream() *******");
		System.out.println(numbers.stream()); // ReferencePipeLine

		System.out.println("\n******** numbers.stream().count() *******");
		System.out.println(numbers.stream().count());

		System.out.println("\n********  stream().of *******");
		System.out.println(Stream.of(1, 2, 45, 98, 46, 578, 15, 3));

		int[] numb = {10, 2, 45, 98, 46, 578, 15, 3};
		System.out.println("\n********  Arrays.stream(numb) *******");
		System.out.println(Arrays.stream(numb));

		System.out.println("\n********  min , max , averange  *******");
		System.out.printf("min: %s , max: %s  , averange: %s , sum: %s ", Arrays.stream(numb).min(),
				Arrays.stream(numb).max(), Arrays.stream(numb).average(), Arrays.stream(numb).sum());

	}

}
