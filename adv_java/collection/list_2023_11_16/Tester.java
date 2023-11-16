package adv_java.collection.list_2023_11_16;

import adv_java.collection.list_2023_11_16.cls.Person;
import adv_java.collection.list_2023_11_16.cls.PersonSimple;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //without lombok
        Person person = new Person("zeev",49,true,"qiryat yam", true, 82_000,true,"435345345",true,22,5);
        System.out.println(person.getAge());
        //System.out.println(person);

        //with lombok
        PersonSimple zeev = new PersonSimple("zeev",0,true,"qiryat yam", true, 82_000,true,"435345345",true,22,5,0);
        PersonSimple avi = new PersonSimple("avi",32,false,"Jerusalm", false, 49_000,true,"6745456",false,1,1,0);
        PersonSimple avi2 = new PersonSimple("avi2",12,true,"Jerusalm", false, 49_000,true,"6745456",false,1,1,0);

        PersonSimple personSimple = new PersonSimple();
        //PersonSimple zeev = new PersonSimple("zeev",49);
        //System.out.println(zeev);
        //System.out.println(personSimple);
        //System.out.println(zeev);
        zeev.setAge(49);
        //System.out.println(zeev);


        //list
//        List myGeneralList = new ArrayList();
//        myGeneralList.add(zeev);
//        myGeneralList.add(5);
//        myGeneralList.add("zeev");

        //{person},5,"zeev"
        //System.out.println(myGeneralList);
        List<PersonSimple> myList = new ArrayList<>();
        myList.add(zeev);
        myList.add(avi);
        myList.add(avi2);
        //myList.add("5"); => error
//        for (int i=0;i<1000;i++){
//            myList.add(zeev);
//        }
        myList.remove(avi2);
        System.out.println(myList);

        //System.out.println("is avi in the list:"+(myList.contains(avi2)));
//        myList.clear();
//        System.out.println(myList);

    }
}
