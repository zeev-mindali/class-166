package org.example.supplier;

import java.util.List;
import java.util.function.Supplier;

public class tester {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrlsSupplier.get());
    }

    //old school
    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    //our school :)
    static Supplier<List<String>>  getDbConnectionUrlsSupplier = ()->List.of(
            "jdbc://localhost:5432/users",
            "jdbc://127.0.0.1:5432/users",
            "jdbc://192.168.1.10:5432/users"
    );

    /*
                function -> apply()
                Predicate-> test()
                Consumer -> accept()
                Supplier -> get()
     */
}
