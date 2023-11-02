package simple_jave.test_prep.test;

import simple_jave.test_prep.cls.Company;
import simple_jave.test_prep.cls.Programmer;
import simple_jave.test_prep.cls.Salary;

import java.util.Random;

public class testCompany {
    public static Company createCompany(){
        //process
        Random rnd = new Random();
        String[] names = {"Gideon","Alexey","Yonatan","Denis","Doron"};
        //create programmers
        Programmer[] programmers = new Programmer[30];
        for (int index=0;index<30;index++){
            programmers[index] = new Programmer(
                    names[rnd.nextInt(names.length)],
                    rnd.nextInt(10),
                    new Salary(rnd.nextDouble()*100_000,rnd.nextInt(100_000))
            );
        }

        //return our new and shiny company

        return null;
    }
}
