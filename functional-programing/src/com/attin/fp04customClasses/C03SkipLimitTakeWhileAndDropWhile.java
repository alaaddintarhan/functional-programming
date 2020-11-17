package com.attin.fp04customClasses;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C03SkipLimitTakeWhileAndDropWhile {

	public static void main(String[] args) {

		List<Course> courses = DataRepository.getCourse();

		Comparator<Course> comparingByIncreasing = Comparator.comparingInt(Course::getReviewScore);

		System.out.println("get just first 2 elements , after than and skip 2 element ");
		System.out.println(courses.stream().sorted(comparingByIncreasing)
				.limit(4)
				.skip(2) // skip 1 first and second element of the stream
				.collect(Collectors.toList()));

		System.out.println(courses.stream().sorted(comparingByIncreasing).collect(Collectors.toList()));
		System.out.println("take while till reviewScore < 400 ");
		System.out.println(courses.stream().sorted(comparingByIncreasing)
				.takeWhile(course -> course.getReviewScore() < 500) // ****
				.collect(Collectors.toList()));

		System.out.println("drop while till reviewScore < 654 ");
		System.out.println(courses.stream().sorted(comparingByIncreasing)
				.dropWhile(course -> course.getReviewScore() < 9000) // ****
				.collect(Collectors.toList()));
	}

}
