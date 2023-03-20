package com.atguigu.java1;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

    static PhantomReferenceTest obj;
    static ReferenceQueue<PhantomReferenceTest> phantomQueue = null;

    public static class CheckRefQueue extends Thread {
        @Override
        public void run() {
            while(true){
                if (phantomQueue != null){
                    PhantomReference<PhantomReferenceTest> objt = null;
                    //PhantomReferenceTest objt = null;
                    try {
                        objt = (PhantomReference<PhantomReferenceTest>) phantomQueue.remove();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (objt != null){
                        System.out.println("追踪垃圾回收过程:PhantomReferenceTest实例被GC了");
                    }
                }
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

    }

}
