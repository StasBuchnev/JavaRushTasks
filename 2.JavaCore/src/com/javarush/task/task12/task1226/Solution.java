package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Solution {

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }


    public static void main(String[] args) {
        InputStream inputStream;
        OutputStream outputStream;
        outputStream.
    }

    public class Cat implements CanRun,CanClimb {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun,CanFly{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
