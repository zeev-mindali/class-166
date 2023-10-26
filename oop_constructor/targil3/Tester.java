package oop_constructor.targil3;

import oop_constructor.targil3.cls.Person;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        //declaration of array
        Person[] persons = new Person[4];


        persons[0] = new Person("zeev",178,107);
        persons[1] = new Person("Amital",158,54);
        persons[2] = new Person("Avrum",162,68);
        persons[3] = new Person("Stam",166,50);

        //print current array
        printShort(persons);
        spr();
        printShort(persons[0].thin2fat(persons));
        spr();
        printShort(persons[0].high2low(persons));
    }

    private static void print(Person[] persons){
        for (int index=0;index<persons.length;index++){
            System.out.println(persons[index].show());
        }
    }

    private static void printShort(Person[] persons){
        //Arrays.stream(persons).toList().forEach(System.out::println);
    }

    private static void spr(){
        System.out.println("=================================================");
    }
}
