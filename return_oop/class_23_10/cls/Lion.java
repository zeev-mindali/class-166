package return_oop.class_23_10.cls;

import return_oop.class_23_10.interfaces.SoundAble;

public class Lion extends Animal implements SoundAble {

    public Lion(String name, String sound) {
        super(name, sound);
    }

    public void eatCow(Cow cow){
        cow.setAlive(false);
    }
}
