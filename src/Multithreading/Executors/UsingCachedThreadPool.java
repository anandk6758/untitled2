package Multithreading.Executors;

import Multithreading.Commons.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {
    public static void main(String[] args) {
        System.out.println("Main thread starts here");

        //creating fixed thread executor service (Initialisation)
        ExecutorService execservice = Executors.newCachedThreadPool();

        //service phase
        execservice.execute(new LoopTaskA());
        execservice.execute(new LoopTaskA());
        execservice.execute(new LoopTaskA());
        /*execservice.execute(new LoopTaskA());
        execservice.execute(new LoopTaskA());
        execservice.execute(new LoopTaskA());*/
        execservice.shutdown();

        System.out.println("Main thread ends here");
    }

}
