package com.attin.fp04customClasses;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C04MinMaxFind {

	public static void main(String[] args) {

		List<Course> courses = DataRepository.getCourse();

		Comparator<Course> comparingByIncreasing = Comparator.comparingInt(Course::getReviewScore);

		System.out.println(courses.stream().sorted(comparingByIncreasing).collect(Collectors.toList()));

		System.out.println("\n min ");
		System.out.println(courses.stream()
				                   .min(comparingByIncreasing).get()); // Optinal

		System.out.println("\n max ");
		System.out.println(courses.stream()
				                  .max(comparingByIncreasing).get()); // Optinal

		System.out.println("\n first");
		System.out.println(courses.stream()
				                  .sorted(comparingByIncreasing)
				                  .findFirst().get()); //Optinal

		System.out.println("\n first Any");
		System.out.println(courses.stream()
				                  .sorted(comparingByIncreasing)
								  .findAny().get());//Optinal

		System.out.println("\n min  orElse ");
		BiPredicate< Course , Integer> filterScoreLessThan90Predicate = (course , lessThan)-> course.getReviewScore()<lessThan;
		System.out.println(
					courses.stream()
							.filter(course -> filterScoreLessThan90Predicate.test(course,84))
							.min(comparingByIncreasing)
							.orElse(  // Optinal <T>
									 new Course("Default", "Framework", 100000, 100000)));

	}
}
