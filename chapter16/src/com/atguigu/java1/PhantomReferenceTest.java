package com.atguigu.java1;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

    static PhantomReferenceTest obj;
    static ReferenceQueue<PhantomReferenceTest> phantomQueue = null;

    public static class CheckRefQueue extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用了当前类的finalize()方法");
        obj = this;
    }

    public static void main(String[] args) {
        Thread t = new CheckRefQueue();
        t.setDaemon(true);
        t.start();

        phantomQueue = new ReferenceQueue<>();
        obj = new PhantomReferenceTest();
        PhantomReference<PhantomReferenceTest> phantomRef = new PhantomReference<PhantomReferenceTest>(obj, phantomQueue);

        try {
            System.out.println(phantomRef.get());
            obj = null;
            System.gc();
            Thread.sleep(1000);
            if (obj == null) {
                System.out.println("obj is null");
            } else {
                System.out.println("obj is not null");
            }
            System.out.println("second gc");
            obj = null;
            System.gc();
            Thread.sleep(1000);
            if (obj == null) {
                System.out.println("obj is null");
            } else {
                System.out.println("obj is not null");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
