package simple_jave.class_23_10.cls;

public abstract class Animal {
    protected String name;
    protected String sound;
    protected boolean isAlive;

    public Animal(String name, String sound) {
        setName(name);
        setSound(sound);
        setAlive(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getSound() {
        return isAlive?sound:"";
    }

    final public String makeSound(){
        return getSound();
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

}
