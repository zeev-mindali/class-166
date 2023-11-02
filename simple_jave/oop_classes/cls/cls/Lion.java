package simple_jave.oop_classes.cls.cls;

public class Lion {
    private String name;
    private String sound;
    private boolean isAlive=true;

    public void eatCow(Cow cow){
        cow.kill();
    }

    public String makeSound(){
        return this.sound;
    }

    public void kill(){
        this.isAlive=false;
    }

}
