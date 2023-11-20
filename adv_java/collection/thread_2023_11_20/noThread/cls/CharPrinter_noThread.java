package adv_java.collection.thread_2023_11_20.noThread.cls;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CharPrinter_noThread {
    private char myChar;

    public void run(){
        for (int counter=1;counter<50;counter++){
            System.out.print(""+this.myChar+counter+this.myChar+'\t');
            if (counter %22==0){
                System.out.println();
            }
        }
    }
}
