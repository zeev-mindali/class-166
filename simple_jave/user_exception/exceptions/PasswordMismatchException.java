package simple_jave.user_exception.exceptions;

public class PasswordMismatchException extends Exception{
    public PasswordMismatchException() {
        super("Password are not the same...");
    }

    public PasswordMismatchException(String message) {
        super(message);
    }
}
