package com.attin.fp3functionalInterfaces;

import com.attin.PrintOutUtil;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FI05SuplierAndUnary {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 8, 7, 8, 3, 4, 98);

		/**
		 * Predicate<T>
		 *
		 * @param <T> the type of the input to the predicate
		 *  returns boolean
		 */
		Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0;

		/**
		 * Function<T,R>
		 *
		 *   @param <T> the type of the input to the function
		 *   @param <R> the type of the result of the function
		 */
		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, String> strigOutputFunction = x -> "square of the x :" + (x * x);

		/**
		 * Consumer<T>
		 *
		 *   @param <T> the type of the input to the operation
		 *   no return
		 */
		Consumer<Integer> consumer = x -> System.out.println(x);

		/**
		 * BinaryOperator<T>
		 * @param <T> the type of the operands and result of the operator
		 */
		BinaryOperator<Integer> subBinaryOperator = (x, y) -> x + y;

		// No input and return something
		/**
		 * Supplier
		 *
		 * Represents a supplier of results.
		 */
		Supplier<Integer> intSupplier = () -> 2;
		Supplier<Integer> randomIntSupplier = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		PrintOutUtil.print("intSupplier : ", intSupplier.get());
		PrintOutUtil.print("randomIntSupplier : ", randomIntSupplier.get());

		/**
		 * UnaryOperator
		 *
		 * Returns a unary operator that always returns its input argument.
		 */
		UnaryOperator<Integer> unaryOperator = (x) -> x + 2;
		PrintOutUtil.print("UnaryOperator : ", unaryOperator.apply(5));
	}

}
