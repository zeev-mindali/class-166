package simple_jave.exam_oop.cls;

public class Teacher extends Person{
    private String profession;

    public Teacher(String name, int age, String profession) {
        super(name, age);
        setProfession(profession);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }
}
