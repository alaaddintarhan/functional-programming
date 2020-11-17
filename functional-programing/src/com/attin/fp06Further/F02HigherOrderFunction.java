package com.attin.fp06Further;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.function.Predicate;

public class F02HigherOrderFunction {

	public static void main(String[] args) {

		DataRepository.getCourse().stream().filter(lengthPredicate(500)).forEach(System.out::println);

		System.out.println("*****");

		DataRepository.getCourse().stream().filter(c -> lengthPredicate(8020).test(c)).forEach(System.out::println);

	}

	private static Predicate<? super Course> lengthPredicate(int thanGreater) {
		return course -> course.getReviewScore() > thanGreater;
	}
}
