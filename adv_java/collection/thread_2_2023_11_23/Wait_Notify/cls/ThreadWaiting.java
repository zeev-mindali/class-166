package adv_java.collection.thread_2_2023_11_23.Wait_Notify.cls;

import java.sql.SQLOutput;

public class ThreadWaiting extends Thread{
    public synchronized void run(){
        System.out.println(getClass().getName()+" Avi is announced for the oscar");
        try {
            //synchronized (this) {
                wait();
            //}
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thanks for my mother and father and all class 166...");
    }
}
