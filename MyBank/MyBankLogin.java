package MyBank;

import MyBank.cls.User;

public class MyBankLogin {
    public static void main(String[] args) {
        User zeev = new User();
        //zeev.uName="zeev";  will not work, since the fields inside the class are private
        //zeev.uPass="12345";

        zeev.setuName("zeev");
        zeev.setuPass("12345");


        //user                                         condition          ?  true        :    false
        System.out.println(zeev.checkLogin("zeev","12345")?"Hello master":"Why who are you");

        //zeev.adminName="Amital";
        //zeev.adminPass="54321";

        //admin
        //System.out.println(zeev.checkLogin("Amital","54321")?"Hello master":"Why who are you");

        //System.out.println("user:"+zeev.adminName+" password:"+zeev.adminPass);
    }
}
