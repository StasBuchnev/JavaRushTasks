package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Mariya",2.0);
        grades.put("Mariya1",3.0);
        grades.put("Mariya2",3.5);
        grades.put("Mariya3",4.0);
        grades.put("Mariya4",5.0);

    }
}
