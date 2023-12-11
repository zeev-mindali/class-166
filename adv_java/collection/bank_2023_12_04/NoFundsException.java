package adv_java.collection.bank_2023_12_04;

public class NoFundsException extends Exception{
    public NoFundsException() {
        super("no money in account");
    }

    public NoFundsException(String message) {
        super(message);
    }
}
