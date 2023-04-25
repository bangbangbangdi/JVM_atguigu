package com.atguigu.java;

public class Test1 {

    public static void main(String[] args) {
        int i = 10;
        i = i++;
        System.out.println(i);

        int j = 10;
        j = ++j;
        System.out.println(j);


        int k = (int)Float.POSITIVE_INFINITY;
        System.out.println(k);

        float f = (float)0.0d;
        System.out.println(f);
    }
}
