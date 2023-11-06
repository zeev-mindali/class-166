package simple_jave.exam_prep_2.cls;

import java.sql.Date;
import java.util.Arrays;

public class Gasoline extends Cars{
    public Gasoline(int km, int owners, Date testDate, String color, String[] images, String manufacturer, String model, int lp, String owner, Buyer buyer, int price) {
        super(km, owners, testDate, color, images, manufacturer, model, lp, owner, buyer, price);
    }

    @Override
    public String toString() {
        return "Gasoline{" +
                "km=" + km +
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
