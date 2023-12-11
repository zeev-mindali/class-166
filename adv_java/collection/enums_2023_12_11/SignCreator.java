package adv_java.collection.enums_2023_12_11;

public enum SignCreator {
    TRIANGLE(3,100),
    SQUARE(4,100),
    PENTAGON(5,100),
    HEXAGON(6,100),
    OCTAGON(8,100);

    private final int point,area;
    SignCreator(int point,int area){
        this.area=area;
        this.point=point;
    }

    public int calcSignArea(int edgeLength){
        return edgeLength*this.point*this.area;
    }

    public int getPoint(){
        return point;
    }
}
