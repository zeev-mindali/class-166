package user_exception;

import user_exception.cls.NewUser;
import user_exception.exceptions.LongException;
import user_exception.exceptions.PasswordMismatchException;
import user_exception.exceptions.ShortException;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter user name, user password, check password:");
        String userName = s.nextLine();
        String userPass = s.nextLine();
        String userPassCheck = s.nextLine();
//        try {
//            NewUser myUser = new NewUser(userName,userPass,userPassCheck);
//        } catch (ShortException e) {
//            System.out.println(e.getMessage());
//        } catch (LongException e) {
//            System.out.println(e.getMessage());
//        } catch (PasswordMismatchException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            NewUser myUser = new NewUser(userName,userPass,userPassCheck);
        } catch (ShortException | LongException | PasswordMismatchException error) {
            System.out.println(error.getMessage());
        }
    }
}
