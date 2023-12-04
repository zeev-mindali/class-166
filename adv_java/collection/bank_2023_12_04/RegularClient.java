package adv_java.collection.bank_2023_12_04;

public class RegularClient extends Client{
    public static final float interestRage = 1.05f;

    public RegularClient(){
        super(interestRage, new Account());
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tType Regular Client\n";
    }
}
