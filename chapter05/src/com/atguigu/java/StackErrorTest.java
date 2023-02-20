package com.atguigu.java;

/**
 * 演示栈中的异常:StackOverflowError
 * 默认情况下: count 9718
 * 设置栈大小: -Xss256k 情况下 2157
 */
public class StackErrorTest {

    private static int count = 1;

    // count 9718
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }

}
