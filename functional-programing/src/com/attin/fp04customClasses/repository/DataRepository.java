package com.attin.fp04customClasses.repository;

import com.attin.fp04customClasses.model.Course;

import java.util.List;

public class DataRepository {
	public static List<Course> getCourse() {

		List<Course> courses = List.of(new Course("Spring", "Framework", 655, 85),
				new Course("Spring Boot", "Framework", 8562, 85),
				new Course("Microservices", "Microservices", 8562, 85),
				new Course("AWS", "Cloud", 8950, 55),
				new Course("FullStack", "FullStack", 9845, 98),
				new Course("Azure", "Cloud", 2000, 12),
				new Course("Docker", "Cloud", 400, 76),
				new Course("Kubernetes", "Cloud", 4000, 6));
		return courses;
	}
}
