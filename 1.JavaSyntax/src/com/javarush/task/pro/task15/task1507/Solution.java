package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        List<String> strings = Files.readAllLines(Path.of(address));

        for (int i = 0; i < strings.size(); i += 2) {
            System.out.println(strings.get(i));
        }



    }
}

