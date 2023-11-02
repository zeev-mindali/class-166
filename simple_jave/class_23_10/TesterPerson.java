package simple_jave.class_23_10;

import simple_jave.class_23_10.cls.*;
import simple_jave.class_23_10.interfaces.PersonAble;

public class TesterPerson {
    public static void main(String[] args) {
        PersonAble[] doron = {
          new Dad(), new Husband(),new Student(),new Avi("avi")
        };

        doron[0].makeSound();
        doron[1].makeSound();
        doron[2].makeSound();
        doron[3].makeSound();
    }
}
