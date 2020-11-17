package com.attin;

public class PrintOutUtil {

	public static void print(String message, Number val) {
		System.out.println("");

		String msg = message.contains("%d") ? message : message + "%d";
		System.out.printf(msg, val);
		System.out.println("");
	}
}
