package adv_java.collection.enums_2023_12_11;


//please all mighty enum
public enum Bulb {
    bulb_5w(5),
    bulb_8w(8),
    bulb_10W(10),
    bulb_12w(12),
    bulb_15w(15),
    bulb_18w(18),
    bulb_24w(24),
    bulb_30w(30),
    bulb_50W(50),
    bulb_100w(100),
    bulb_150w(150),
    bulb_200w(200);

    private final int watt;
    Bulb(int watt){
        this.watt=watt;
    }

    public double getNormalWatt(){
        return this.watt*7.5;
    }
}
