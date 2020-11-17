package com.attin.fp06Further;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F01JoiningFlatMap {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Kubernetes");

		System.out.println("**** joining ****");
		System.out.println(courses.stream().collect(Collectors.joining(",")));

		String txt = "FunctionalProgramming";
		Arrays.stream(txt.split("o")).forEach(el -> System.out.printf("element: %s , ",el));

		List<String[]> collect = courses.stream()
				                        .map(c -> c.split(""))
				                        .collect(Collectors.toList());

		System.out.println("\n****flatMap****");
		courses.stream()
				.map(c -> c.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList())
				.forEach(c -> System.out.printf("%s,", c));

	List<String> myCourses = List.of( "Java","Spring Boot",  "Microservices", "Azure");
	List<String> myLanguages = List.of("Java", "R", "Python", "C", "Scala");

	List<List<String>>	skillTupes= myCourses.stream()
												  .flatMap(myCourse -> myLanguages.stream()
																				  .map(language -> List.of(myCourse,language)))
			                                                                      .collect(Collectors.toList());
																				   //.forEach(x -> System.out.println(x));
	System.out.println("\nList\n"+skillTupes);

	//Eliminate same elements repeated twice :  [Java, Java]
	List<List<String>>	filteredSkillTupes=skillTupes.stream()
													 .filter(list -> !list.get(0).equals(list.get(1)))
			                                         .collect(Collectors.toList());
	System.out.println("\nFiltered List \n"+filteredSkillTupes);

	//Eliminate tuples with same length
    List<List<String>> filteredSkillTupesWithoutSameLength = skillTupes.stream()
			                                                           .filter(list -> !list.get(0).equals(list.get(1)))
			                                                           .filter(list -> list.get(0).length()!=list.get(1).length())
			                                                           .collect(Collectors.toList());
    System.out.println("\nFiltered Same LengthList \n"+filteredSkillTupesWithoutSameLength);


	}
}
