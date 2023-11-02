package simple_jave.Exceptions.cls;

import java.util.Scanner;

public class ExceptionWithMessage {
    public static int getNumber() throws Exception{
        Scanner s = new Scanner(System.in);
        int myNumber = s.nextInt();
        if (myNumber<1 || myNumber>10){
            throw new Exception("number must be between 1-10");
        }
        return myNumber;
    }

    public static void main(String[] args) {
        System.out.println("enter a number between 1-10");
        try {
            System.out.println("your number is: "+getNumber());
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}
