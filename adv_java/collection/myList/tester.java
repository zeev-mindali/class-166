package adv_java.collection.myList;

import adv_java.collection.myList.cls.Person;

import java.util.ArrayList;
import java.util.List;

public class tester {
    public static void main(String[] args) {
        List myList = new ArrayList();

        myList.add(5);
        myList.add("Zeev");
        myList.add(false);
        myList.add(5.00);

        for (int index=0;index< myList.size();index++){
            System.out.println(myList.get(index));
        }

        List<Person> students= new ArrayList<>();
        students.add(new Person("Alexey",18));
        students.add(new Person("Gidon", 22));
        students.add(new Person("Avi",58));
        students.add(new Person("Yonatan",31));

//        for (Person student : students) {
//            System.out.println(student);
//        }

        students.forEach(System.out::println);

    }
}
