package com.attin.fp01Introduction;

import java.util.List;

public class I01Structured {

    public static void main(String[] args) {

        printAllNumbers(List.of(12, 9, 8, 7, 8, 3, 4, 98));
    }

    static void printAllNumbers(List<Integer> numbers) {

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
