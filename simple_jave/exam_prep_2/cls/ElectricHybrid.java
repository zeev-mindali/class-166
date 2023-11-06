package simple_jave.exam_prep_2.cls;

import java.sql.Date;

public class ElectricHybrid extends Cars{
    private int batteryCapacity;
    private int batteryCycles;

    public ElectricHybrid(int km, int owners, Date testDate, String color, String[] images, String manufacturer, String model, int lp, String owner, Buyer buyer, int price, int batteryCapacity, int batteryCycles) {
        super(km, owners, testDate, color, images, manufacturer, model, lp, owner, buyer, price);
        setBatteryCapacity(batteryCapacity);
        setBatteryCycles(batteryCycles);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCycles() {
        return batteryCycles;
    }

    public void setBatteryCycles(int batteryCycles) {
        this.batteryCycles = batteryCycles;
    }
}
