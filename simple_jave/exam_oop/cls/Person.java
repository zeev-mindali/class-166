package simple_jave.exam_oop.cls;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<20){
            age=20;
        }
        if (age>120){
            age=120;
        }
        this.age = age;
    }
}
