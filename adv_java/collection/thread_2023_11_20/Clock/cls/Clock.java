package adv_java.collection.thread_2023_11_20.Clock.cls;

public class Clock implements Runnable{
    private int seconds=0;

    private boolean isRunning = true;
    @Override
    public void run() {
        while (isRunning) {
            seconds += 1;
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I was interrupted");
                break;
            }
        }
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }


}
