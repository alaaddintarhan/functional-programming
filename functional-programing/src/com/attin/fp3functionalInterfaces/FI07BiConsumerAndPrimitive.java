package com.attin.fp3functionalInterfaces;

import java.util.function.*;

public class FI07BiConsumerAndPrimitive {

	// IntBinaryOperator
	// IntConsumer
	// IntFunction
	// IntPredicate
	// IntSupplier
	// IntToDoubleFunction
	// IntToLongFunction
	// IntUnaryOperator

	//Long , Doube, Int

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		UnaryOperator<Integer> unaryOperator = x -> x * x;
		System.out.printf("unaryOperator : %s\n", unaryOperator.apply(5));

		BiPredicate<Integer, Integer> biPredicate = (x, y) -> {
			return x > y;
		};
		System.out.printf("biPredicate : %s", biPredicate.test(5, 6));

		/**
		 * BiConsumer, IntConstumer
		 */
		BiConsumer<Integer, String> biConsumer = (age, name) -> {
			System.out.printf("Age: %s , Name: %s\n", age, name);
		};
		biConsumer.accept(31, "Attin");
		IntConsumer intConsumer = x -> System.out.printf("IntConsumer : %s\n", x);
		intConsumer.accept(32);

		/**
		 * {@link BinaryOperator} , {@link IntBinaryOperator}
		 */
		BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
		IntBinaryOperator intBinaryOperator = (x, y) -> x + y;

		/**
		 * {@link BiFunction} , {@link IntFunction}
		 */
		BiFunction<Integer, String, String> biFunction = (num, str) -> {
			return str + num;
		};
		System.out.printf("biPredicate : %s\n", biFunction.apply(5, "my number "));

		IntFunction<String> intFunction = x -> {
			return "intFunction: " + x;
		};

	}

}
