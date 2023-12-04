package adv_java.collection.bank_2023_12_04;

public class VipClient extends Client{
    public static final float interestRate=1.10f;

    public VipClient(){
        super(interestRate,new Account());
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tType: VIP client\n";
    }
}
