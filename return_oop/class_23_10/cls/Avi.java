package return_oop.class_23_10.cls;

import return_oop.class_23_10.interfaces.PersonAble;
import return_oop.class_23_10.interfaces.SoundAble;

public class Avi implements PersonAble {
    private String name;

    public Avi(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Hello my brother from another mother....");
    }
}
