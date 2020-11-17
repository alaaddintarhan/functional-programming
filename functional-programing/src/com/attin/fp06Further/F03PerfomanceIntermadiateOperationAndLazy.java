package com.attin.fp06Further;

import java.util.List;

public class F03PerfomanceIntermadiateOperationAndLazy {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Kubernetes");

		System.out.println(courses.stream()
                                  .peek(System.out::println)
                                  .filter(course -> course.length() > 11)
				                  .peek(System.out::println) // as like sys.out
				                  .map(String::toUpperCase)
                                  .findFirst()); //findFirst : as soon as it finds the first element,
        // it does not even look at  the other elements. it found Microservice and  it didn't loof AWS,Azure,Docker,Kubernetes

        /** About Perfomance
         *
         * Intermediate Operation (all lazy on the stream) : filter , map , peek , etc
         * Terminal Operation :  findFirst
         *
         * Java executes entire set of code ONLY when it knows what is expected result.
         * It will not execute the code until it knows what the Terminal Operation is
         *
         */
        System.out.println("\nas like below");
        System.out.println(courses.stream()
                .peek(System.out::println)
                .filter(course -> course.length() > 11)
                .peek(System.out::println) // as like sys.out
                .map(String::toUpperCase));
    }
}
