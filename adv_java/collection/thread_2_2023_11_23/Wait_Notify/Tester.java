package adv_java.collection.thread_2_2023_11_23.Wait_Notify;

import adv_java.collection.thread_2_2023_11_23.Wait_Notify.cls.ThreadNotify;
import adv_java.collection.thread_2_2023_11_23.Wait_Notify.cls.ThreadWaiting;

public class Tester {
    public static void main(String[] args) {
        ThreadWaiting threadWaiting = new ThreadWaiting();
        ThreadNotify threadNotify = new ThreadNotify(threadWaiting);

        threadWaiting.start();
        threadNotify.start();
    }
}
