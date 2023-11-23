package adv_java.collection.thread_2_2023_11_23.Sleeper.cls;

import java.util.Random;

//Sleep / Runnable / Run
public class Sleepy extends Thread{
    public Random rnd;
    public Sleepy(String name){
        super(name);
        rnd = new Random();
    }

    public void run(){
        for (int counter=0 ;counter<10;counter++){
            int sleepTime = rnd.nextInt(500)+500;
            System.out.println(getName()+" i go to sleep for "+ sleepTime+"ms (#"+(counter+1)+")");
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println("i was interrupted");
            }
            System.out.println(getName()+" wakes up (#"+(counter+1)+")");
        }
    }
}
