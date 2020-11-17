package com.attin.fp04customClasses;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C06GroupBy {

	public static void main(String[] args) {

		List<Course> courses = DataRepository.getCourse();

		BiPredicate<Course, Integer> filterScoreLessThanPredicate = (course,
				lessThan) -> course.getReviewScore() < lessThan;

		System.out.println(" groupBy");
		System.out.println(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884000))
				.collect(Collectors.groupingBy(Course::getCategory)));

		System.out.println(" groupBy  into groupBy ");
		System.out.println(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884000))
				.collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));

		System.out.println(" maxBy  into groupBy ReviewScore");
		System.out.println(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884000))
				.collect(Collectors.groupingBy(Course::getCategory,
						Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));


		System.out.println(" mapping  into groupBy ");
		System.out.println(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884000))
				.collect(Collectors.groupingBy(Course::getCategory,
						Collectors.mapping(Course::getName,Collectors.toList()))));

	}
}
