package com.attin.fp07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class F02ReadFile {

	public static void main(String[] args) {

		try {
			Files.lines(Paths.get("file.txt")).forEach(System.out::println);

			Files.lines(Paths.get("file.txt"))
					.map(line -> line.split(" "))
//					.flatMap(strings -> Arrays.stream(strings))
					.flatMap(Arrays::stream)
					.distinct()
					.sorted()
					.collect(Collectors.toList())
					.forEach(System.out::println);

			System.out.println("\n\n****Paths.get and isDirectory***\n");

			Files.list(Paths.get("."))
					.filter(Files::isDirectory)
					.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
