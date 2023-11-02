package simple_jave.test_prep.cls;

public class Worker {
    protected String name;
    protected int expirance;

    public Worker(String name, int expirance) {
        setName(name);
        setExpirance(expirance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpirance() {
        return expirance;
    }

    public void setExpirance(int expirance) {
        this.expirance = expirance;
    }
}
