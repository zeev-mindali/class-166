package adv_java.collection.thread_2023_11_20.Clock;

import adv_java.collection.thread_2023_11_20.Clock.cls.Clock;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Runnable myClock = new Clock();
        Thread myClockThread = new Thread(myClock);
        myClockThread.start();
        Thread.sleep(3500);
        //myClock.stop(); //will extremely stop the thread
        myClockThread.interrupt(); //interrupt the running thread, invoke InterruptedException.....
        //((Clock)myClock).setRunning(false);
    }
}
