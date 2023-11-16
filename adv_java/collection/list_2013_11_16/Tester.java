package adv_java.collection.list_2013_11_16;

import adv_java.collection.list_2013_11_16.cls.Person;
import adv_java.collection.list_2013_11_16.cls.PersonSimple;

public class Tester {
    public static void main(String[] args) {
        //without lombok
        Person person = new Person("zeev",49,true,"qiryat yam", true, 82_000,true,"435345345",true,22,5);
        System.out.println(person.getAge());
        //System.out.println(person);

        //with lombok
        PersonSimple zeev = new PersonSimple("zeev",0,true,"qiryat yam", true, 82_000,true,"435345345",true,22,5,0);
        PersonSimple personSimple = new PersonSimple();
        //PersonSimple zeev = new PersonSimple("zeev",49);
        //System.out.println(zeev);
        //System.out.println(personSimple);
        System.out.println(zeev);
        zeev.setAge(49);
        System.out.println(zeev);

    }
}
