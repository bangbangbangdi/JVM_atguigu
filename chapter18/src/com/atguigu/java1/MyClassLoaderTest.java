package com.atguigu.java1;

public class MyClassLoaderTest {

    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader("/Users/chendabang/developer/GitHubPJ/JVM_atguigu/out/production/chapter18/com/atguigu/java1/");
        try {
            Class<?> clazz = loader.loadClass("Demo");
            System.out.println("加载此类的加载器为：" + clazz.getClassLoader().getClass().getName());
            System.out.println("加载此类的加载器为：" + clazz.getClassLoader().getParent().getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
