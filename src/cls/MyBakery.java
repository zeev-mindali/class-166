package src.cls;

public class MyBakery {
    public static void main(String[] args) {
        //create a new cake -> object (instance)
        Cake cake1 = new Cake();
        cake1.cakeType="choco";
        cake1.cakeSubType="chocolate";
        cake1.length=10;
        cake1.price=100;
        cake1.width=30;

        Cake cake2 = new Cake();
        cake2.cakeType="bchusha";
        cake2.cakeSubType="nutz";
        cake2.width=30;
        cake2.length=20;
        cake2.price=10;

        System.out.println(cake1.toLabel());
        System.out.println(cake2.toLabel());
    }
}
