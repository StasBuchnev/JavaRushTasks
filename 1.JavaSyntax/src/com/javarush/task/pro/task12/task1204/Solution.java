package com.javarush.task.pro.task12.task1204;

/* 
Плата по счетам
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "User" + separator + "Desktop" + separator + "dok.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


        scanner.close();
    }
}
