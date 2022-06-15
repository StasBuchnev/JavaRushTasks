package com.javarush.task.pro.task18.task1801;

import java.util.*;

/* 
Две реализации одного интерфейса
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static int[]list2 =  new int[]{23,34,123,123,21};
    public static ArrayList<Runnable>runnables = new ArrayList<>();


    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());
Arrays.sort(list2);
        runList();

    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (Runnable runnable : list) {
            runnable.run();
        }



    }
}