package simple_jave.PolyMorphizam;

public class Tester {
    public static void main(String[] args) {
        Person[] alexy = {new Father(),new Husband(),new Student(), new Person()};

        ((Father)alexy[0]).playWithKids();
        ((Husband)alexy[1]).giveFlower();
        ((Student)alexy[2]).makeHomeWork();
        alexy[3].sayHello();
        //((Animal)alexy[3]).roar(); //error

    }
}
