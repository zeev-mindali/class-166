package adv_java.collection.thread_2023_11_20.noThread.cls;

import java.util.ArrayList;
import java.util.List;

public class Eager_Starvation {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Printing \n=====================================");
            List<Thread> myNames = new ArrayList<>();
            myNames.add(new Thread(new MyRunnable("Zeev")));
            myNames.add(new Thread(new MyRunnable("Yonatan")));
            myNames.add(new Thread(new MyRunnable("Gideon")));
//            myNames.get(0).setPriority(1); //zeev <==Starvation
//            myNames.get(2).setPriority(9); //gideon <==Eager

        //second list
        List<Thread> myNames2 = new ArrayList<>();
        myNames2.add(new Thread(new MyRunnable("Alexy")));
        myNames2.add(new Thread(new MyRunnable("Ani Po")));
        myNames2.add(new Thread(new MyRunnable("rashamta uti")));

            for (Thread item:myNames){
                item.start();
//                System.out.println("Priority: "+item.getPriority());
                //item.join(); //will each time create new group threads
            }
            //we telling all the threads that we are need to wait for all of them to finish

            for (Thread item:myNames2){
                item.start();
            }

        for (Thread item:myNames){
            item.join(); //first group
        }

//        for (Thread item:myNames2){
//                item.join(); //second group
//            }


        System.out.println("\n==================================\n ending printing");
            //once all threads are finished, we continue with the program......


    }
}
