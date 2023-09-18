package oop_classes.cls.cls;

public class Cat {
    private String name;
    private String sound;
    private boolean isAlive=true;

    public void kill(){
        this.isAlive=false;
    }

    public boolean drinkMilk(Cow cow){
        return cow.giveMilk();
    }

    public boolean eatMouse(Mouse mouse){
        return true;
    }

    public String makeSound(){
        return this.sound;
    }
}
