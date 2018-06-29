package com.motor.teste;

/**
 * Created by 15dcc on 2018/6/28.
 */

public class Test {

    ThreadLocal<Integer> longLocal = new ThreadLocal<Integer>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();

    public int a;

    public void set() {
        longLocal.set(a);
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) {

        final Test test = new Test();
        test.set();
        test.a++;

        System.out.println(test.getLong());
        System.out.println(test.getString());

        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(test.getLong());
        System.out.println(test.getString());

//        try {
//            plus();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

//    private static void plus() throws Exception {
//        for (int i = 0; i < 10; i++) {
//            new Thread() {
//                public void run() {
//                    //1
//                    a = threadLocal.get();
//                    a++;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("plus:" + Thread.currentThread().getName() + ": " + a);
//                }
//            }.start();
//        }
//    }

//    private static void plus() {
//        for (int i = 0; i < 10; i++) {
//            new Thread() {
//                public void run() {
//                    synchronized (Test.class) {
//                        a++;
//                        try {
//                            Thread.sleep(1);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println("plus:" + Thread.currentThread().getName() + ": " + a);
//                    }
//                }
//            }.start();
//        }
//    }
}
