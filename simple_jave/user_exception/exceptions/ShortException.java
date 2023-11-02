package simple_jave.user_exception.exceptions;

public class ShortException extends Exception{
    public ShortException() {
        super ("User name or Password too short");
    }

    public ShortException(String message) {
        super(message);
    }
}
