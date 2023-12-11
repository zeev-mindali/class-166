package adv_java.collection.enums_2023_12_11;

public enum Alert {
    Normal,Warning,Danger;

    public String getAlert(String msg){
        switch (this){
            case Normal :
                return msg;
            case Warning:
                return msg+"!!";
            case Danger:
                return "!!"+msg.toUpperCase()+"!!";
        }
        return msg;
    }
}
