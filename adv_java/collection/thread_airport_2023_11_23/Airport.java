package adv_java.collection.thread_airport_2023_11_23;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    public static final int TOTAL_PLANE=10;
    private static List<Thread> fleet = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int counter=1;counter<=TOTAL_PLANE;counter++){
//            Runnable airPlane = new AirPlane(counter);
//            Thread myPlane = new Thread(airPlane);
//            fleet.add(myPlane);
            fleet.add(new Thread(new AirPlane(counter)));
        }

        for (Thread plane:fleet){
            plane.start();
        }

        for (Thread plane:fleet){
            plane.join();
        }

        System.out.println("All planes is on the ground, closing air port");
        Thread.sleep(1000);
        System.out.println("Air Port is closed !!!!");
    }
}
