package adv_java.collection.thread_2_2023_11_23.Sleeper.cls;

public class BigBalagn extends Thread{
    private static int counter=0;
    private static Object theMutex = new Object();
    public void run(){
        synchronized (theMutex) {
            System.out.println(currentThread().getName() + " before inc: counter=" + counter);
            counter++;
            System.out.println(currentThread().getName() + " after inc: counter=" + counter);
        }
    }

    public static void main(String[] args) {
        BigBalagn[] balagnArray = new BigBalagn[10];
        for (int index = 0; index< balagnArray.length;index++){
            balagnArray[index]= new BigBalagn(); //because it's object array, we need to initialize each cell.
            balagnArray[index].start();
        }
    }
}
