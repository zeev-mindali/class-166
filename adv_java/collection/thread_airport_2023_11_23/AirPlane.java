package adv_java.collection.thread_airport_2023_11_23;

public class AirPlane implements Runnable{
    private final int airPlaneId;
    private final int takeOffTime = (int)(Math.random()*1000)+500; //500->1500
    private final int landingTime = (int)(Math.random()*1000)+500;
    private int distanceTime = (int)(Math.random()*1000)+500;
    //public static final Object takeOffMutex = new Object();
    //public static final Object landingMutex = new Object();
    public static final Object mutex = new Object();
    public AirPlane(int airPlaneId){
        this.airPlaneId=airPlaneId;
    }
    @Override
    public void run() {
        try {
            takeOff();
            fly();
            land();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private void fly() throws InterruptedException {
        System.out.println("Plane #"+this.airPlaneId+" is flying for "+distanceTime+" ms");
        Thread.sleep(distanceTime);
    }

    private void takeOff() throws InterruptedException {
        System.out.println("Plane #"+this.airPlaneId+" want to take off");
        synchronized (mutex){
            System.out.println("Plane #"+this.airPlaneId+" is taking off");
            Thread.sleep(takeOffTime);
            System.out.println("Plane #"+this.airPlaneId+" is in the air.....");
        }
    }

    public void land() throws InterruptedException {
        System.out.println("Plane #"+this.airPlaneId+" wants to land");
        synchronized (mutex){
            System.out.println("Plane #"+this.airPlaneId+" is landing");
            Thread.sleep(landingTime);
            System.out.println("Plane #"+this.airPlaneId+" is landed !!!! (hopefully)");
        }
    }
}
