package simple_jave.exam_prep_2.my_test;

import simple_jave.exam_prep_2.cls.*;

import java.sql.Date;


public class CompanyTester {
    public static Company createCompany(){
        //create two migrash, two car, one sold
        Buyer buyer1 = new Buyer(
                "zeev","052-404-3142","qiryat yam",new Payment(450_000));

        Buyer buyer2 = new Buyer("avi","052-445-1234","Bney Brak",new Payment("mimun yashir",10,15_000));

        Cars car1 = new ElectricHybrid(
                30_000, 1, new Date(2024,12,12),"white", new String[]{"url1", "url2"},
                "Mercedes","e350",4520201,"private",buyer1,450_000,120_000,2000
        );

        Cars car2 = new Diesel(
                420_000,3,new Date(2024,7,8),"grey", new String[]{"url1","url2","url3"},
                "B.M.W", "x7", 1220286, "Company",null,150_000,true);

        Cars car3 = new Gasoline(74_000,1,null,"dark blue",new String[]{"url1"},"Subaru","Impreza",3445434,"Private",null,40_000);

        Migrash migrash1 =  new Migrash("Alexy","Holon","052-252-5555",100, new Cars[]{car1,car2});

        Migrash migrash2 = new Migrash("Yonatan", "Ramat-Gan","054-444-5555",50, new Cars[]{car1,car3});

        return new Company("Doron & sons","055-555-5555","Doron",
                new Migrash[]{migrash1,migrash2}
        );
    }
}
