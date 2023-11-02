package simple_jave.Exceptions.cls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myClass {
   private static  int getNumber() throws InputMismatchException{
       Scanner s = new Scanner(System.in);
       throw new InputMismatchException("oops i did it again");
       //return s.nextInt();
   }

   public static String askForNumbers()  {
           int num1 = getNumber();
           int num2 = getNumber();
           return String.valueOf(num1+num2);
   }

    public static void main(String[] args) {
        System.out.println("Hello my master (avi)\n==========================");
        String result= null;
        try {
            result = askForNumbers();
        } catch (InputMismatchException e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("result: "+result);
    }
}
