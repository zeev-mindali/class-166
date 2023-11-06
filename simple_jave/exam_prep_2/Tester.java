package simple_jave.exam_prep_2;

import simple_jave.exam_prep_2.cls.Company;
import simple_jave.exam_prep_2.my_test.CompanyTester;

public class Tester {
    public static void main(String[] args) {
        Company company = CompanyTester.createCompany();
        System.out.println(company);
    }
}
