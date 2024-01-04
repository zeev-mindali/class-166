package org.example.LambdaExpression;

public class Person {
    private final String name;
    private final Gender gender;
    Person(String name,Gender gender){
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Gender getGender() {
        return gender;
    }
}
