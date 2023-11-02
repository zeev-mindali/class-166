package simple_jave.class_23_10.cls;

import simple_jave.class_23_10.interfaces.PersonAble;

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
