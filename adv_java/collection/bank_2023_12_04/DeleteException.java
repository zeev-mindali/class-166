package adv_java.collection.bank_2023_12_04;

public class DeleteException extends Exception{
    public DeleteException() {
        super("we have an error in delete");
    }

    public DeleteException(String message) {
        super(message);
    }
}
