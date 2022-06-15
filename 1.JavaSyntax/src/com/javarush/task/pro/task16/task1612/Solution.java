package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);

        Map<String, Map<Integer, List<String>>> stringMapMap = new HashMap<>();
        Map<Integer, List<String>> listMap = new HashMap<>();
        List<String>strings = new ArrayList<>();
        strings.add("Java");
        strings.add("tete");
        strings.add("rer");
        listMap.put(4,strings);
        stringMapMap.put("Helou",listMap);

    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> set = new HashSet<>();

        for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
            for (LocalTime value : entry.getValue()) {
                set.add(LocalDateTime.of(entry.getKey(),value));
            }
        }


        return set;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}

//    HashMap<String, Integer> map = new HashMap<String, Integer>();
//map.put("Серега", 21);
//        map.put("Николай", 22);
//        map.put("Иван Петрович", 48);
//        map.put("Анюта", null);
//
//        for (String key: map.keySet())
//        {
//        Integer value = map.get(key);
//        System.out.println(key + " --> " + value);
//        }