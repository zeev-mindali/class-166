package oop_classes.cls.cls;

public class Cow {
    private String name;
    private String sound;
    private boolean isAlive=true;

    public void kill(){
        this.isAlive=false;
    }

    public boolean giveMilk(){
//        if (this.isAlive){
//            //cow is alive
//            return true;
//        } else {
//            return false;
//        }
        return this.isAlive;
    }

    public String makeSound(){
        return this.sound;
    }
}
