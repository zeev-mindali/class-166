package return_oop.class_23_10;

import return_oop.class_23_10.cls.*;
import return_oop.class_23_10.interfaces.PersonAble;
import return_oop.class_23_10.interfaces.SoundAble;

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
