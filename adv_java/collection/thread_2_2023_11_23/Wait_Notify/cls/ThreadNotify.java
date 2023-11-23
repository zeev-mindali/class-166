package adv_java.collection.thread_2_2023_11_23.Wait_Notify.cls;

public class ThreadNotify extends Thread{
    private ThreadWaiting threadWaiting;

    public ThreadNotify(ThreadWaiting threadWaiting){
        this.threadWaiting = threadWaiting;
    }

    public void run(){
        System.out.println(getClass().getName()+"And the oscar goes to .....");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getClass().getName()+" and the winner is:");

        synchronized (threadWaiting) {
            threadWaiting.notify();
        }
    }
}
