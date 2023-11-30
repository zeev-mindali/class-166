package adv_java.collection.birthday_solution_2023_11_30;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    //מספר עובד
    private int id;
    private String name;
    private LocalDate birthDay;

    private static int counter=1;

    public Person(){
        id = counter;
        name = "person "+counter;
        birthDay = DateFactory.getLocalDate() ;// random birthDay
        counter++;
    }

    public Person(int id, String name, LocalDate birthDay){
        this.id=id;
        this.name=name;
        this.birthDay=birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + DateUtil.beautifyDate(birthDay) +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.getBirthDay().compareTo(person.getBirthDay());
    }

    //if we use Set, it's compare between the objects that we don't have same person with same birthday
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(birthDay, person.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDay);
    }
}
