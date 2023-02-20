package com.atguigu.java1;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {

    public static void main(String[] args) {
        System.out.println("-------启动类加载器-------");
        // 获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }
        // 从上面的路径中随意选择一个类，来看看他的类加载器是什么 引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);

        //system.out.println("----------扩展类加载器----------");
        //string exdirs = system.getproperty("java.ext.dirs");
        //for (string path : exdirs.split(";")) {
        //    system.out.println(path);
        //}
        // 从上面的路径中随意选择一个类，来看看他的类加载器是什么 扩展类加载器
        //ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        //System.out.println(classLoader1);


    }

}
