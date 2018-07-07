package Multithreading;

import Multithreading.Commons.LoopTaskB;

public class NamingThreadsThreadRunning {
    public static void main(String[] args) {
        System.out.println("Main Thread starts here");
        String currentThreadName = Thread.currentThread().getName();

        System.out.println(currentThreadName+" Main thred starts here");

        new Thread(new LoopTaskB(), "My-Thread 1").start();

        Thread t2 = new Thread(new LoopTaskB());
        t2.setName("My-Thread 2");
        t2.start();

        System.out.println("Main Thread ends here");

    }
}
