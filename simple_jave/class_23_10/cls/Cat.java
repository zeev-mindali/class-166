package simple_jave.class_23_10.cls;

import simple_jave.class_23_10.interfaces.SoundAble;

public class Cat extends Animal implements SoundAble {
    public Cat(String name, String sound) {
        super(name, sound);
    }

    public boolean drinkMilk(Cow cow){
        return cow.isAlive && !cow.isMale();
    }

    //method in parent is final
//    @Override
//    public String makeSound() {
//        return "How do you do?";
//    }
}
