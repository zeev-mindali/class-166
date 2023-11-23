package adv_java.collection.thread_2023_11_20.noThread.cls;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class MyRunnable implements Runnable{

    private String name;
    //we must write run method , when we using threads....
    public void run(){ //thread main -> invoked by calling the class with start() method
        for (int counter=1;counter<50;counter++){
            System.out.print(this.name+"\t");
            if (counter%10==0){
                System.out.println();
            }
        }
    }
}
