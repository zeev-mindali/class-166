package user_exception.cls;

import user_exception.exceptions.LongException;
import user_exception.exceptions.PasswordMismatchException;
import user_exception.exceptions.ShortException;

public class NewUser {
    private String userName;
    private String userPass;

    public NewUser(String userName, String userPass, String userPassCheck) throws ShortException, LongException, PasswordMismatchException {
        setUserName(userName);
        setUserPass(userPass,userPassCheck);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws ShortException, LongException{
        if (userName.length()<4){
            throw new ShortException("User name too short");
        }
        if (userName.length()>15){
            throw new LongException("User name too long");
        }
        this.userName = userName;
    }

    public void setUserPass(String userPass, String userPassCheck) throws ShortException,PasswordMismatchException{
        if (userPass.length()<4){
            throw new ShortException("Password too short");
        }
        if (!userPass.equals(userPassCheck)){
            //throw new PasswordMismatchException("סיסמאות לא תואמות");
            throw new PasswordMismatchException();
        }
        this.userPass = userPass;
    }

}
