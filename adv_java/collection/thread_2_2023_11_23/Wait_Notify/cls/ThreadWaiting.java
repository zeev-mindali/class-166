package adv_java.collection.thread_2_2023_11_23.Wait_Notify.cls;

import java.sql.SQLOutput;

public class ThreadWaiting extends Thread{
    public void run(){
        System.out.println(getClass().getName()+" me waiting");
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("all is good, contiune to work....");
    }
}
