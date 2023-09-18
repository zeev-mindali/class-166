package oop_classes.MyBank.cls;

public class User {
    //שם משתמש
    private String uName;
    //סיסמא
    private String uPass;
    //משתמש קבוע
    private final String adminName="zeevik";
    private final String adminPass="112233";

    public String getuName(){
        return this.uName;
    }

    public void setuName(String uName){
        //procedure to check if the user can change it's name
        this.uName=uName;
    }

    public void setuPass(String uPass){
        //procedure to check if the user can change it's name
        this.uPass=uPass;
    }
    public boolean checkLogin(String userName, String userPass){
        //will not work
//        if (userName==uName && userPass==uPass || userName==adminName && userPass==adminPass){
//            return true;
//        } else {
//            return false;
//        }

        //junior
//        if (userName.equals(uName) && userPass.equals(uPass) || userName.equals(adminName) && userPass.equals(adminPass)){
//            return true;
//        } else {
//            return false;
//        }

        //senior
        return (userName.equals(uName) && userPass.equals(uPass)) || (userName.equals(adminName) && userPass.equals(adminPass));
    }


}
