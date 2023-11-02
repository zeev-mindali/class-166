package simple_jave.cls;

import simple_jave.cls.cls.Banner;
import simple_jave.cls.cls.SimpleClass;

public class tester {
    //public static int id=1000;
    public static void main(String[] args) {
        SimpleClass demo1 = new SimpleClass("zeev",49);
        SimpleClass demo2 = new SimpleClass( "amital",47);

        System.out.println(demo1);
        System.out.println(demo2);

        //System.out.println(Banner.getMyClass());
        System.out.println(Banner.convertDate("26/10/2023"));
        System.out.println(Banner.convertDate("11/13/2023"));



    }
}
