package oop_classes.Clock;

public class Tester {
    public static void main(String[] args) {
        Clock machine1 = new Clock();
        machine1.setMinutes(29);
        machine1.setHours(2);

        machine1.tick();
    }
}
