package com.attin.fp04customClasses;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class C05SumAverangeCount {

	public static void main(String[] args) {

		List<Course> courses = DataRepository.getCourse();

		BiPredicate<Course, Integer> filterScoreLessThanPredicate = (course,
				lessThan) -> course.getReviewScore() < lessThan;

		System.out.println(courses.stream().filter(course -> filterScoreLessThanPredicate.test(course,884)).collect(Collectors.toList()));

		System.out.print("sum : ");
		System.out.println(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884))
				.mapToInt(Course::getNoOfStudents)
				.sum());

		System.out.print("averange : ");
		System.out.println(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884))
				.mapToInt(Course::getNoOfStudents)
				.average().getAsDouble());


		System.out.print("count : ");
		System.out.print(courses.stream()
				.filter(course -> filterScoreLessThanPredicate.test(course, 884))
				.mapToInt(Course::getNoOfStudents)
				.count());

	}
}
