package simple_jave.cls.cls;

public class SimpleClass {
    private static int id=100;
    private int instanceId;
    private String name;
    private int age;

    public SimpleClass( String name, int age) {
        this.instanceId=id++;
        //id++;
        //System.out.println(id);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "id=" + this.instanceId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
