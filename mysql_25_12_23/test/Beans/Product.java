package mysql_25_12_23.test.Beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    //sn,price,category,supplier,name
    private String sn;
    private double price;
    private int category;
    private int supplier;
    private String name;
}
