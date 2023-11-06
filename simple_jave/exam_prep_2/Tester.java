package simple_jave.exam_prep_2;

import simple_jave.exam_prep_2.cls.Company;
import simple_jave.exam_prep_2.cls.Migrash;
import simple_jave.exam_prep_2.my_test.CompanyTester;

public class Tester {
    public static void main(String[] args) {
        Company company = CompanyTester.createCompany();
        System.out.println(company);
        System.out.println("===============");
        System.out.println(Company.getTotalCar());
        System.out.println("================="); //cheap car
        int low = Integer.MAX_VALUE;
        for (Migrash item: company.getMigrashim()){
//            if (item.getCheapCar()<low){
//                low = item.getCheapCar();
//            }
            low=Math.min(low, item.getCheapCar());
        }
        System.out.println("Lowest car price:"+low);
        System.out.println("============================");
        int total = 0;
        for (Migrash item: company.getMigrashim()){
            total+=item.getTotalMoney();
        }
        System.out.println("Total money:"+total);
    }
}
