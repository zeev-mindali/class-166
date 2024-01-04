package org.example.streams;

import org.example.streams.beans.Car;
import org.example.streams.beans.Person;
import org.example.streams.mockData.MockData;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) throws IOException {
        List<Person> people = MockData.getPeople();
//        List<Person> young = new ArrayList<>();
//
//        //old school (גישה הכרחית)
//        int limit = 10;
//        int counter=0;
//        for (Person person:people){
//            if (person.getAge()<18){
//                young.add(person);
//                counter++;
//                if (counter == limit){
//                    break;
//                }
//            }
//        }

        //גישה הצהרתית
//        List<Person> young = people.stream()
//                .filter(item ->item.getAge()<18)
//                .limit(10)
//                .collect(Collectors.toList());
//
//        young.forEach(System.out::println);

        //CARS CARS CARS
        List<Car> cars = MockData.getCars();

        Predicate<Car> carCostPredicate = car->car.getPrice()<20_000.00;
        Predicate<Car> yellow = car->car.getColor().toLowerCase().equals("yellow");
        Predicate<Car> bug2000 = car->car.getYear()==2000;

        List<Car> cheapAndYellowCars = cars.stream()
                .filter(bug2000)
                .toList();

        cheapAndYellowCars.forEach(System.out::println);

        Stream.of(2,4,6,8,9,10,13)
                .filter(number->number%2==0)
                .forEach(number-> System.out.print(number+" "));

        System.out.println();
        Stream.of(2,4,6,8,9,10,13,14,15,16)
                .dropWhile(number->number%2==0)
                .forEach(number-> System.out.print(number+" "));

        System.out.println();
        Stream.of(2,4,6,8,9,10,13,14,15,16)
                .takeWhile(number->number%2==0)
                .forEach(number-> System.out.print(number+" "));
        System.out.println();
        System.out.println("=================================================");
        int[] numbers = {1,7,3,4,5,6,7,7,7,10};
        int result = Arrays.stream(numbers).filter(number->number%2==0)
                .findFirst()
                .orElse(-1);
        System.out.println(result);
        System.out.println("=================================================");

        int[] even = {2,4,6,8,10};
        boolean allEven = Arrays.stream(even).allMatch(n->n%2==0);
        System.out.println("All Even:"+allEven);

        int[] evenAndOneOdd = {2,4,6,5,8,10};
        boolean anyMatch = Arrays.stream(evenAndOneOdd).anyMatch(n->!(n%2==0));

        System.out.println("do we have odd number hiding by the help of olga? "+anyMatch);

        System.out.println("================================================");

        List<Integer> uniqeNumbers = List.of(2,4,4,4,5,5,5,5,5,7,7,7,7,7,7);
        Set<Integer> distinct = uniqeNumbers.stream().collect(Collectors.toSet());
        distinct.forEach(System.out::println);
        List<Integer> dist2 = uniqeNumbers.stream().distinct().toList();
        dist2.forEach(System.out::println);

    }
}
