package simple_jave.Clock;

import simple_jave.Clock.cls.Clock;

public class Tester {
    public static void main(String[] args) {
        Clock c1 = new Clock(19,50);
        Clock c2 = new Clock(9,0);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("--------------------------");
        Clock.setIs24(false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("--------------------------");
        int[] num={1,2,3};
        System.out.println(num[num.length]);
    }
}
