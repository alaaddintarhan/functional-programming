package com.attin.fp3functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FI06BiPredicateAndBiFunction {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (age, name) -> {
			return (age > 18 & name.contains("A"));
		};
		System.out.println("result : " + biPredicate.test(19, "Attin"));

		BiFunction<Integer,String,String> biFunction = (age,name) -> {
			return  (name +" is "+age+" years old.");
		};
		System.out.println("result : " + biFunction.apply(19, "Attin"));

	}

}
