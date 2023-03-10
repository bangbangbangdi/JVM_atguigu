package com.atguigu.java1;

public class OperandStackTest {

    public void testAddOperation(){
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    public int getSum(){
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum(){
        int i = getSum();
        int j = 10;
    }


    /*
    程序员面试过程中， 常见的i++和++i 的区别，放到字节码篇章时再介绍。

     */
    public static void add(){
        //第1类问题：
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第2类问题：
        int i3 = 10;
        int i4 = i3++;
        System.out.println("10" + i4);

        int i5 = 10;
        int i6 = ++i5;
        System.out.println("11" + i6);

        //第3类问题：
        int i7 = 10;
        i7 = i7++;
        System.out.println("10 "+i7);

        int i8 = 10;
        i8 = ++i8;
        System.out.println("11 "+i8);

        //第4类问题：
        int i9 = 10;
        int i10 = i9++ + ++i9;
        System.out.println("22 "+i10);

    }

    public static void main(String[] args) {
        add();
    }
}
