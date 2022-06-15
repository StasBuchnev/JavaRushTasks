package com.javarush.task.pro.task16.task1606;

import java.sql.Time;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Выход из зацикленности
*/

public class Solution {

    public static void main(String[] args) {
      LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();

        localDate.getMonthValue();


    }
}
