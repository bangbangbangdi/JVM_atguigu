package com.atguigu.java;

public class StackStruTest {

    public static void main(String[] args) {
        //int i = 2 + 3;
        int i = 2;
        int j = 3;
        int k = i + j;

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("hello");

    }


}
