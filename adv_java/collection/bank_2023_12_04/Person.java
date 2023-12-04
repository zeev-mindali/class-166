package adv_java.collection.bank_2023_12_04;

public abstract class Person {
    protected int id;
    protected String name;
    private double age;
    public Person(){
        this.age=(int)(Math.random()*105)+16;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{"+this.id+"\n\tName:"+this.name+"\'"+"\n\tAge: "+this.age+"}";
    }
}
