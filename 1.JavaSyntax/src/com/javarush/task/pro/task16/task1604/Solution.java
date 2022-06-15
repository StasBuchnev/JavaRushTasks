package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1994, 0, 30);

    public static void main(String[] args) {
       System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Calendar calendar) {


        int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String s = "";
        switch (dayWeek) {
            case 1:
                return "Воскресенье";
            case 2:
                return "Понедельник";
            case 3:
                return "вторник";
            case 4:
                return "среда";
            case 5:
                return "четверг";
            case 6:
                return "пятница";
            case 7:
                return "суббота";
        }


        return s;
    }
}
