package mysql_25_12_23.test;

import mysql_25_12_23.test.Beans.Product;
import mysql_25_12_23.test.CLS.ConnectionPool;
import mysql_25_12_23.test.CLS.DBtools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tester {
    //SQL Injection
    public static final String ADD_PRODUCT_BAD = "INSERT INTO `onlinestore`.`products` " +
            "(sn,price,category,supplier,name) "+
            " VALUES('zzzzz',19.99,3,2,`Raw Alexy`";

    public static final String ADD_PRODUCT = "INSERT INTO `onlinestore`.`products` "+
            "(sn,price,category,supplier,name) VALUES(?,?,?,?,?)";

    public static final String ALL_PRODUCTS = "SELECT * FROM `onlinestore`.`products`";
    public static final String ALL_PRODUCTS_ABOVE_PRICE= "SELECT * FROM `onlinestore`.`products` WHERE price>?";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS`onlinestore`.`olga` (" +
            "  `id` INT NOT NULL AUTO_INCREMENT," +
            "  `child_name` VARCHAR(45) NULL," +
            "  `child_age` INT NULL," +
            "  `child_grade` VARCHAR(45) NULL," +
            "  `child_birthday` DATETIME NULL," +
            "  PRIMARY KEY (`id`)," +
            "  UNIQUE INDEX `child_name_UNIQUE` (`child_name` ASC) VISIBLE);";
    public static void main(String[] args) throws SQLException {
        //addProduct(new Product("zeevik",0.99,1,1,"Zeevik the fox"));
//        Map<Integer,Object> myParams = new HashMap<>();
//        List<Product> myProducts = new ArrayList<>();
//        //myProducts.add(new Product("alexy",1_000_000,1,1,"ALexey PTN"));
//        //myProducts.add(new Product("Putin",1,1,1,"Put in"));
//        myProducts.add(new Product("Olga",100,1,1,"Olga the princess"));
//        myProducts.add(new Product("Moran",1_000_000_000,1,1,"The one and only"));
//        //addProduct(myProducts.get(0));
//
//        for (Product item:myProducts){
//            myParams.put(1,item.getSn());
//            myParams.put(2,item.getPrice());
//            myParams.put(3,item.getCategory());
//            myParams.put(4,item.getSupplier());
//            myParams.put(5,item.getName());
//            DBtools.runQuery(ADD_PRODUCT,myParams);
//        }
//
//
//        DBtools.runQuery(ADD_PRODUCT,myParams);
//        //create table....
//        //createTable();

        List<Product> myProducts = new ArrayList<>();
        Map<Integer,Object> params = new HashMap<>();
        params.put(1,1000);
        ResultSet result = DBtools.runQueryForResult(ALL_PRODUCTS_ABOVE_PRICE,params);
        //int,string,int,int,int,string
        //Iterator
        while (result.next()){
            int id = result.getInt(1);
            String sn = result.getString(2);
            int price = result.getInt(3);
            int cat = result.getInt(4);
            int sup = result.getInt(5);
            String name = result.getString(6);
            myProducts.add(new Product(id,sn,price,cat,sup,name));
        }
        System.out.println(myProducts);
    }

    private static void createTable() {
        //create a connection
        Connection connection = null;

        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_TABLE);
            preparedStatement.execute();
        } catch (InterruptedException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }


    }

    private static boolean addProduct(Product product){
        //create a connection
        Connection connection = null;

        //get connection
        try {
            connection = ConnectionPool.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(ADD_PRODUCT);
            preparedStatement.setString(1,product.getSn());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setInt(3,product.getCategory());
            preparedStatement.setInt(4,product.getSupplier());
            preparedStatement.setString(5, product.getName());

            preparedStatement.execute();
            return true;
        } catch (InterruptedException | SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }
}
