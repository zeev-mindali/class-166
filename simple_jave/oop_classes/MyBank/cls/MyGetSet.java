package simple_jave.oop_classes.MyBank.cls;

public class MyGetSet {
    private String name;
    private int age;
    private String address;
    private int weight;
    private boolean isMarried;
    private String city;
    private double income;
    private int children;
    private boolean isDriveLicense;
    private String hairColor;
    private boolean isMale;
    private String eduction;

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city.length()<2){
            System.out.println("City must be more then 5 chars");
            this.city="N/A";
            return;
        }
        this.city = city;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isDriveLicense() {
        return isDriveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        isDriveLicense = driveLicense;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getEduction() {
        return eduction;
    }

    public void setEduction(String eduction) {
        this.eduction = eduction;
    }
}
