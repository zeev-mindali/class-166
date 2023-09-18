package oop_classes.cls.cls;

public class Mouse {
    private String name;
    private String sound;
    private boolean isAlive=true;

    public boolean mouseStatus(){
        return this.isAlive;
    }

    public String makeSound(){
        return this.sound;
    }
}
