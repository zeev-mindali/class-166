package oop_classes.targil3;

import oop_classes.targil3.cls.Person;

public class Tester {
    public static void main(String[] args) {
        //declaration of array
        Person[] persons = new Person[4];

        //initialization of array
        for (int index=0;index< persons.length;index++){
            persons[index]=new Person();
        }

        //insert data into each object
        persons[0].setName("zeev");
        persons[0].setHeight(178);
        persons[0].setWeight(107);

        persons[1].setName("Amital");
        persons[1].setHeight(158);
        persons[1].setWeight(54);

        persons[2].setName("Avrum");
        persons[2].setHeight(162);
        persons[2].setWeight(68);

        persons[3].setName("Stam");
        persons[3].setHeight(166);
        persons[3].setWeight(50);

        //print current array
        print (persons);
        spr();
        print(persons[0].thin2fat(persons));
        spr();
        print(persons[0].high2low(persons));
    }

    private static void print(Person[] persons){
        for (int index=0;index<persons.length;index++){
            System.out.println(persons[index].show());
        }
    }

    private static void spr(){
        System.out.println("=================================================");
    }
}
