package adv_java.collection.enums_2023_12_11;

public class SimpleEnum {
    enum Direction {North,South,East, West}

    public static void main(String[] args) {
        Direction myDirection = Direction.West;

        switch (myDirection){
            case North:
                System.out.println("Qiryat Yam");
                break;
            case East:
                System.out.println("Jerusalem");
                break;
            case West:
                System.out.println("Meditarien sea");
                break;
            case South:
                System.out.println("Eilat");
                break;
        }

        printAllOptions();
    }

    private static void printAllOptions() {
        for (Direction option:Direction.values()){
            System.out.println(option);
        }
    }
}
