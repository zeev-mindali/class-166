package adv_java.collection.enums_2023_12_11;

public class SignCreateTester {
    public static void main(String[] args) {
        SignCreator mySign = SignCreator.TRIANGLE;
        System.out.println(mySign.calcSignArea(100));
    }
}
