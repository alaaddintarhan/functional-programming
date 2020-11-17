package com.attin.fp06Further;

import java.util.List;
import java.util.stream.LongStream;

public class F04ParallelizationOfStream {

	public static void main(String[] args) {

		/** MyComputer
		 *
		 * Cores  : 4
		 * Hardware Threads : 8
		 */

		long time = System.currentTimeMillis();

		System.out.println(LongStream.range(0,1000000000).sum()); // => 577 ms
		System.out.println(System.currentTimeMillis()-time);

		time = System.currentTimeMillis();

		System.out.println(LongStream.range(0,1000000000).parallel().sum()); // => 166 ms
		System.out.println(System.currentTimeMillis()-time);

    }
}
