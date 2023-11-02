package simple_jave.MyObject;

public class Tester {
    public static void main(String[] args) {
        SoundAble[] soundAbles = {new Avi(),new Dog(), new Car(), new Tv()};

        for(SoundAble item: soundAbles){
            System.out.println(item.makeSound());
        }
        System.out.println("============================================");
        for (int index=0;index< soundAbles.length;index++){
            System.out.println(soundAbles[index].makeSound());
        }

        //for each=>(Class item:array){
        //
        //}
    }
}
