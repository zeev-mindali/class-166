package first_oop.src.cls;

import java.util.Arrays;

public class Cake {
    //סוג העוגה
    String cakeType;
    //תת סוג של העוגה
    String cakeSubType;
    //רוחב של העוגה
    int width;
    //אורך של העוגה
    int length;
    //תוספות לעוגה
    String[] addons;
    double price;

    @Override
    public String toString() {
        return "Cake{" +
                "cakeType='" + cakeType + '\'' +
                ", cakeSubType='" + cakeSubType + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", addons=" + Arrays.toString(addons) +
                ", price=" + price +
                '}';
    }

    public String toLabel(){
        return this.cakeType+" "+this.price+"₪";
    }
}
