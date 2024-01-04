package functional.programmin_04_01_2024;

import functional.programmin_04_01_2024.cls.PersonDTO;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class programming04_01_2024 {
    public static void main(String[] args) throws IOException {
        //example1(); //grouping car by manufacturer
        //example2();
        //example3();
        example4();
    }

    private static void example4() throws IOException {
        List<org.example.streams.beans.Person> people = org.example.streams.mockData.MockData.getPeople();
        Function<org.example.streams.beans.Person, PersonDTO> persononPersonDTOFunction = person ->
                new PersonDTO(
                        person.getId(),
                        person.getFirstName(),
                        person.getAge()
                );

        List<PersonDTO> dtos = people.stream()
                .filter(person -> person.getAge()>21)
                .map(PersonDTO::map)
                //.map(persononPersonDTOFunction)
                .toList();

        System.out.println(dtos);
    }

    private static void example3() throws IOException {
        List<org.example.streams.beans.Car> cars = org.example.streams.mockData.MockData.getCars();
        Double min = cars.stream()
                .mapToDouble(org.example.streams.beans.Car::getPrice)
                .min()
                .orElse(0);

        System.out.println("Minimum: "+min);

        Double max = cars.stream()
                .mapToDouble(org.example.streams.beans.Car::getPrice)
                .max()
                .orElse(0);

        System.out.println("Maximum: "+max);

        Double avg = cars.stream()
                .mapToDouble(org.example.streams.beans.Car::getPrice)
                .average()
                .orElse(0);

        System.out.println("Average: "+avg);

        Double sum = cars.stream()
                .mapToDouble(org.example.streams.beans.Car::getPrice)
                .sum();

        System.out.println("total sum: "+ BigDecimal.valueOf(sum));
    }

    private static void example2() {
        List<String> names = List.of(
                "zeev","amital","raz","raz","zeev","alexy", "zeev",
                "amital","amital","amital","amital", "olga", "K/Marina"
        );

        //pojo
        /*Map<String,Integer> countNames = new HashMap<>();
        for (String item:names){
            if (countNames.containsKey(item)){
                countNames.put(item,countNames.get(item)+1);
            } else {
                countNames.put(item,1);
            }
        }

        for (Map.Entry<String,Integer> item: countNames.entrySet()){
            System.out.println("name: "+item.getKey()+" appeared: "+item.getValue()+" times");
        }*/

        //functional programming
        Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(map);

    }

    public static void example1() throws IOException {
        Map<String, List<org.example.streams.beans.Car>> map = org.example.streams.mockData.MockData
                .getCars()
                .stream()
                .collect(Collectors.groupingBy(org.example.streams.beans.Car::getMake));

        map.forEach((carType,cars)->{
            System.out.println("-------------------");
            System.out.println("car type: "+carType);
            System.out.println("-------------------");
            cars.forEach(System.out::println);
        });
    }
}
