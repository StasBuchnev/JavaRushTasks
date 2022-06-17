package com.javarush.task.pro.task18.task1804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Знакомство с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {

        numbers.sort(( index1,  index2) -> index1 - index2);
    }
}
//Collections.sort(list, (String obj1, String obj2) ->
//        {
//        return obj1.length() – obj2.length();
//        }
//        );