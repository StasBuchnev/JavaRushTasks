package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String st = scanner.nextLine();


        System.out.println(st.equalsIgnoreCase(secret) ? "доступ разрешен" : "доступ запрещен");

    }
}
