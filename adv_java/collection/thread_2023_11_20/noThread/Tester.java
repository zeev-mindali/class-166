package adv_java.collection.thread_2023_11_20.noThread;

import adv_java.collection.thread_2023_11_20.noThread.cls.CharPrinter_Thread;
import adv_java.collection.thread_2023_11_20.noThread.cls.CharPrinter_noThread;
import adv_java.collection.thread_2023_11_20.noThread.cls.MyRunnable;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //CharPrinter printer1= new CharPrinter('$');
        //CharPrinter printer2=new CharPrinter('%');

        //without Threads
//        List<CharPrinter_noThread> myPrinters = new ArrayList<>();
//        myPrinters.add(new CharPrinter_noThread('$'));
//        myPrinters.add(new CharPrinter_noThread('%'));
//
//        for (CharPrinter_noThread item:myPrinters){
//            item.run();
//        }

        CharPrinter_noThread stam1 = new CharPrinter_noThread('$');
        CharPrinter_Thread stam2 = new CharPrinter_Thread('$');


//        List<CharPrinter_Thread> myPrinters = new ArrayList<>();
//        myPrinters.add(new CharPrinter_Thread('$'));
//        myPrinters.add(new CharPrinter_Thread('%'));
//
//        System.out.println("i am printing before the thread...");
//        for(CharPrinter_Thread item:myPrinters){
//            //item.run(); //this is a call for method, not for a thread  => synchronize coding
//            item.start(); //this is a call for statring a thread => a-sync coding
//        }
//        System.out.println();
//        System.out.println("i am printing after the thread....");


         //create a thread with the interface
//         Runnable runnable = new MyRunnable();   <=== polymorphism
//         Thread myThread = new Thread(runnable);
//         myThread.start();

//        Thread myThread = new Thread(new MyRunnable("Zeevik the fox"));
//        myThread.start();
//            List<Thread> myNames = new ArrayList<>();
//            myNames.add(new Thread(new MyRunnable("Zeev")));
//            myNames.add(new Thread(new MyRunnable("Yonatan")));
//            myNames.add(new Thread(new MyRunnable("Gideon")));

//            for (Thread item:myNames){
//                item.start();
//            }

        System.out.println("id: "+Thread.currentThread().getId());
        System.out.println("name: "+Thread.currentThread().getName());
        System.out.println("Priority: "+Thread.currentThread().getPriority());
        System.out.println("toString: "+Thread.currentThread().toString());
        System.out.println();
        CharPrinter_Thread printer1 = new CharPrinter_Thread('$');
        System.out.println("id: "+printer1.getId());
        System.out.println("name: "+printer1.getName());
        System.out.println("Priority: "+printer1.getPriority());
        System.out.println("toString: "+printer1.toString());
        printer1.setName("printer thread"); // <== setting a name to thread to recognize
        System.out.println("name: "+printer1.getName());
    }
}
