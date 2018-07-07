package Multithreading.Commons;

import java.util.concurrent.TimeUnit;

public class LoopTaskB implements Runnable{

    private static int count = 0;
    private int instanceNumber;
    private String taskId;


    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("********Thread-"+currentThreadName+"- "+taskId+" starting*********");

        for(int i =10; i<0; i--){

            System.out.println("********Thread-"+currentThreadName+"- "+taskId+" tick tick*********");
            try{
                TimeUnit.MILLISECONDS.sleep(200);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println("********Thread-"+currentThreadName+"- "+taskId+" ending*********");

    }

    public LoopTaskB(){

        this.instanceNumber = ++count;
        this.taskId = "Loopstask B"+instanceNumber;
    }
}
