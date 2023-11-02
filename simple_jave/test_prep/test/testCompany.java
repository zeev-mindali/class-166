package simple_jave.test_prep.test;

import simple_jave.test_prep.cls.*;

import java.util.Random;

public class testCompany {
    public static String[] names = {"Gideon","Alexey","Yonatan","Denis","Doron"};
    public static String[] positions = {"qa","programming","general"};
    public static Company createCompany(){
        //create programmers
        Department[] departments = new Department[3];
        return new Company(
                getDepartment(3)
        );
    }

    private static Programmer[] getProgrammer(int total){
        Random rnd = new Random();
        Programmer[] programmers = new Programmer[total];
        for (int index=0;index<total;index++) {
            programmers[index]=new Programmer(
                    names[rnd.nextInt(names.length)],
                    rnd.nextInt(10),
                    new Salary(rnd.nextDouble() * 100_000, rnd.nextInt(100_000))
            );
        }
        return programmers;
    }

    private static Manager getManager(){
        Random rnd = new Random();
        return new Manager(
                names[rnd.nextInt(names.length)],
                rnd.nextInt(10),
                new Salary(rnd.nextDouble()*100_000,rnd.nextInt(100_000)),
                positions[rnd.nextInt(positions.length)]
        );
    }

    private static Department[] getDepartment(int total){
        Random rnd = new Random();
        Department[] temp = new Department[total];
        for (int index=0;index<temp.length;index++){
            temp[index]=new Department(
                    Department.DEP_NAMES[rnd.nextInt(Department.DEP_NAMES.length)],
                    getManager(),
                    getProgrammer(9)
            );
        }
        return temp;
    }
}
