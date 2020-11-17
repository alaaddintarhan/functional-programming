package com.attin.fp04customClasses;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02SortingAndComparators {

	public static void main(String[] args) {

		List<Course> courses = DataRepository.getCourse();

		System.out.println(courses);

		System.out.println("*******");

		Comparator<Course> comparingByIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
		System.out.println(courses.stream()
				                   .sorted(comparingByIncreasing)
				                   .collect(Collectors.toList()));

		Comparator<Course> comparingByDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
		System.out.println(courses.stream()
				                  .sorted(comparingByDecreasing)
				                  .collect(Collectors.toList()));

		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews = Comparator.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore).reversed();
		System.out.println(courses.stream()
				                  .sorted(comparingByNoOfStudentsAndNoOfReviews)
				                  .collect(Collectors.toList()));

	}

}
