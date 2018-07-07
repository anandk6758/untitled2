package Multithreading.Commons;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable{

    private static int count = 0;
    private int id;


    @Override
    public void run() {
        System.out.println("********Task - "+id+" starting*********");

        for(int i =10; i<0; i--){

            System.out.println("<"+id+"> tick tick "+i);
            try{
                TimeUnit.MILLISECONDS.sleep(200);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println("********Task - "+id+" ending*********");

    }

    public LoopTaskA(){
        this.id = ++count;
    }
}
