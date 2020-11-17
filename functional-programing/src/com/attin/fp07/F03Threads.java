package com.attin.fp07;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class F03Threads {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					//System.out.println(Thread.currentThread().getId()+" : "+i);
				}
			}
		};
		System.out.println(Thread.getAllStackTraces().keySet().stream().map(thread -> thread.getName()).collect(Collectors.toList()));

		Thread thread1 = new Thread(runnable);
		thread1.start();

		Thread thread2 = new Thread(runnable);
		thread2.start();

		Thread thread3 = new Thread(runnable);
		thread3.start();

		System.out.println(Thread.getAllStackTraces().keySet().stream().map(thread -> thread.getName()).collect(Collectors.toList()));


		Runnable runnableByFp = () ->  {
			IntStream.range(0,1000)
					 .forEach(x->System.out.println(Thread.currentThread().getId()+" : "+x));
		};

		Thread thread4 = new Thread(runnableByFp);
		thread4.start();
		Thread thread5 = new Thread(runnableByFp);
		thread5.start();
		Thread thread6 = new Thread(runnableByFp);
		thread6.start();
	}
}
