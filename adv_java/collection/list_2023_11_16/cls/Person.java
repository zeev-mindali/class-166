package adv_java.collection.list_2023_11_16.cls;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private boolean isMarried;
    private String address;
    private boolean hasCar;
    private int income;
    private boolean isMale;
    private String id;
    private boolean homeOwner;
    private int flatNumber;
    private int floor;

    public Person(String name, int age, boolean isMarried, String address, boolean hasCar, int income, boolean isMale, String id, boolean homeOwner, int flatNumber, int floor) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.address = address;
        this.hasCar = hasCar;
        this.income = income;
        this.isMale = isMale;
        this.id = id;
        this.homeOwner = homeOwner;
        this.flatNumber = flatNumber;
        this.floor = floor;
    }

    public Person(){}


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
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isHomeOwner() {
        return homeOwner;
    }

    public void setHomeOwner(boolean homeOwner) {
        this.homeOwner = homeOwner;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && isMarried() == person.isMarried() && isHasCar() == person.isHasCar() && getIncome() == person.getIncome() && isMale() == person.isMale() && isHomeOwner() == person.isHomeOwner() && getFlatNumber() == person.getFlatNumber() && getFloor() == person.getFloor() && Objects.equals(getName(), person.getName()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getId(), person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isMarried(), getAddress(), isHasCar(), getIncome(), isMale(), getId(), isHomeOwner(), getFlatNumber(), getFloor());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", address='" + address + '\'' +
                ", hasCar=" + hasCar +
                ", income=" + income +
                ", isMale=" + isMale +
                ", id='" + id + '\'' +
                ", homeOwner=" + homeOwner +
                ", flatNumber=" + flatNumber +
                ", floor=" + floor +
                '}';
    }


}
