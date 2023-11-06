package simple_jave.exam_prep_2.cls;

import java.sql.Date;
import java.util.Arrays;

public class Diesel extends Cars{
    private boolean gasReport;

    public Diesel(int km, int owners, Date testDate, String color, String[] images, String manufacturer, String model, int lp, String owner, Buyer buyer, int price, boolean gasReport) {
        super(km, owners, testDate, color, images, manufacturer, model, lp, owner, buyer, price);
        setGasReport(gasReport);
    }

    public boolean isGasReport() {
        return gasReport;
    }

    public void setGasReport(boolean gasReport) {
        this.gasReport = gasReport;
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "gasReport=" + gasReport +
                ", km=" + km +
                ", owners=" + owners +
                ", testDate=" + testDate +
                ", color='" + color + '\'' +
                ", images=" + Arrays.toString(images) +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", lp=" + lp +
                ", owner='" + owner + '\'' +
                ", buyer=" + buyer +
                ", price=" + price +
                "}\n";
    }
}
