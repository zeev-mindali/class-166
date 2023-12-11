package adv_java.collection.bank_2023_12_04;

public class ClientNotFoundException extends Exception{
    public ClientNotFoundException() {
        super("Why who are you?");
    }

    public ClientNotFoundException(String message) {
        super(message);
    }
}
