package org.example.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        List<Person> people = List.of(
          new Person("Zeev", Gender.MALE),
          new Person("Amital", Gender.FEMALE),
          new Person("Alexy", Gender.MALE),
          new Person("Karina",Gender.FEMALE),
          new Person("Olga", Gender.FEMALE),
          new Person("Raz",Gender.MALE)
        );

        //imperative approach....
        List<Person> woman = new ArrayList<>();

        for (Person person:people){
            if (Gender.FEMALE.equals(person.getGender())){
                woman.add(person);
            }
        }

        for (Person person:woman){
            System.out.println(person);
        }

        System.out.println("=========================================");
        //Declarative approach
        List<Person> man = people.stream()
                .filter(item -> Gender.MALE.equals(item.getGender()))
                .collect(Collectors.toList());

        man.forEach(System.out::println);
    }
}
