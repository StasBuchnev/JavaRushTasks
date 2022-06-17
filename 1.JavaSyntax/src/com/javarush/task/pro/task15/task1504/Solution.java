package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in);
             InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));
        ) {
//            byte[] bytesIn = inputStream.readAllBytes();//19
//            byte[] byteOut = new byte[bytesIn.length];//19
//            for (int i = 0; i < bytesIn.length; i += 2) {
//                if (i < bytesIn.length - 1) {
//                    byteOut[i] = bytesIn[i + 1];
//                    byteOut[i + 1] = bytesIn[i];
//                } else {
//                    byteOut[i] = bytesIn[i];
//                }
//            }
//
//            outputStream.write(byteOut);

        }
    }
}


