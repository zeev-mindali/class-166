package simple_jave.exam_prep_2.cls;

public class Company {
    private String name;
    private String tel;
    private String owner;
    private static int totalCar=0;
    private Migrash[] migrashim;
    public Company(String name, String tel, String owner, Migrash[] migrashim) {
        setName(name);
        setTel(tel);
        setOwner(owner);
        setMigrashim(migrashim);
    }

    public Migrash[] getMigrashim() {
        return migrashim;
    }

    public void setMigrashim(Migrash[] migrashim) {
        this.migrashim = migrashim;
    }

    public static void sellCar(){
        Company.totalCar--;
    }

    public static void buyCar(){
        Company.totalCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        owner = owner;
    }

    public static int getTotalCar() {
        return totalCar;
    }

    public static void setTotalCar(int totalCar) {
        Company.totalCar = totalCar;
    }
}
