package com.atguigu.java1;

import com.sun.org.apache.bcel.internal.classfile.LocalVariable;

import java.util.Stack;

public class StackFrameTest {

    public static void main(String[] args) {
        StackFrameTest test = new StackFrameTest();
        test.method1();
    }

    private void method1(){
        System.out.println("method1 开始执行...");
        try {
            method2();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("method1 执行结束...");
    }


    private int method2() {
        int a = 10/0;
        System.out.println("method2 开始执行...");
        int i = 10;
        int m = (int) method3();
        method3();
        System.out.println("method2 即将结束...");
        return i + m;
    }

    private double method3() {
        System.out.println("method3 开始执行...");
        double j = 20.0;
        System.out.println("method3 即将结束...");
        return j;
    }

}
