package simple_jave.exam_prep_2.cls;

import java.sql.Date;

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
}
