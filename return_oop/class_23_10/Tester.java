package return_oop.class_23_10;

import return_oop.class_23_10.cls.*;
import return_oop.class_23_10.interfaces.SoundAble;

public class Tester {
    public static void main(String[] args) {
        //Lion, Cow, Cat, Mouse => Animal
        Lion lev = new Lion("Lev","ROAAAAAAAR!!!!!");
        Cow mush = new Cow ("Mush", "Muuuuuuu",true);
        Cow mushit = new Cow("Mushit","Muu",false);
        Cat bumper = new Cat ("Bumper","Miuoooooo");
        Mouse mish = new Mouse("Mish","sqiuutttttt");

//        System.out.println("Cow breathing:"+mush.isAlive());
//        lev.eatCow(mush);
//        System.out.println("Cow breathing:"+mush.isAlive());

        //System.out.println(bumper.drinkMilk(mush)?"Yammi":"She dead");
        //boolean isDrinking = bumper.drinkMilk(mush);
//        if (isDrinking){
//            //true
//            System.out.println("Yammi");
//        } else {
//            //false
//            System.out.println("The cow is dead");
//        }
//        System.out.println(bumper.drinkMilk(mush)?"Yammi":"The cow is dead");
//        System.out.println("------------------------------------");
//        System.out.println(lev.makeSound());
//        System.out.println(mushit.makeSound());
//        System.out.println(bumper.makeSound());
        Animal[] animals = {
                new Cow("mush","muuuu",true),
                new Lion("Lev","Roaaaaar!!!!"),
                new Snake("snaky"),
                new Cat("Bumper","Miouuuuuu"),
                new Fish("FishFish")
        };

        //print only the  sound-able instance
        //each instance
        for(Animal singleAnimal:animals){
            if (singleAnimal instanceof SoundAble){
                System.out.println(singleAnimal.makeSound());
            }
        }
        //0,1,2,3,4......
        for (int index=0;index< animals.length;index++){
            if (animals[index] instanceof SoundAble) {
                System.out.println(animals[index].makeSound());
            }
        }

        System.out.println("--------------------------------");
        SoundAble[] sounds = {
                //new Avi("Avi the king"),
                new Cat("Bumper","Miouuuuuuu")
        };

        for (SoundAble item:sounds){
            System.out.println(item.makeSound());
        }
    }
}
