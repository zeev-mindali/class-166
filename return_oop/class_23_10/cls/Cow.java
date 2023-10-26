package return_oop.class_23_10.cls;

import return_oop.class_23_10.interfaces.SoundAble;

public class Cow extends Animal implements SoundAble {
    private boolean isMale;

    public Cow(String name, String sound, boolean isMale) {
        super(name, sound);
        setMale(isMale);
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
