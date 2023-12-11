package adv_java.collection.bank_2023_12_04;

public class RazException extends Exception{
    public RazException() {
        super("No raz in the house");
    }

    public RazException(String message) {
        super(message);
    }
}
