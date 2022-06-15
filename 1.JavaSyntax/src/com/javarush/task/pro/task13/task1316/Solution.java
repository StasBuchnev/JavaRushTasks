package com.javarush.task.pro.task13.task1316;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {

        String[] str = new String[]{"Mers", "renoult", "serrary", "Shkoda", "Audi"};
        System.out.println("---------------------------------------");
        for (String s : str) {
            if(s.startsWith("s")){
                System.out.println(s);

            }
            try {
                System.out.println(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
