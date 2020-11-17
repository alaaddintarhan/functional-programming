package com.attin.fp04customClasses;

import com.attin.fp04customClasses.model.Course;
import com.attin.fp04customClasses.repository.DataRepository;

import java.util.List;
import java.util.function.Predicate;

public class C01Matching {

	public static void main(String[] args) {

		// allMatch, nonMatch , anyMatch

		List<Course> courses = DataRepository.getCourse();

		Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;

		// BiPredicate<Course,Integer> predicate = (course,thresold) ->
		// course.getReviewScore()>thresold;

		System.out.printf("allMatch : %s \n", courses.stream().allMatch(reviewScoreGreaterThan90Predicate));

		System.out.printf("noneMatch : %s \n", courses.stream().noneMatch(reviewScoreGreaterThan90Predicate));

		System.out.printf("anyMatch : %s \n", courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));
	}

}
