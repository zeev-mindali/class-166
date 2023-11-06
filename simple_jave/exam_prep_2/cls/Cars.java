package simple_jave.exam_prep_2.cls;

import java.sql.Date;

public abstract class Cars {
    protected int km;
    protected int owners;
    protected Date testDate;
    protected String color;
    protected String[] images;
    protected String manufacturer;
    protected String model;
    protected int lp;
    protected String owner;
    protected Buyer buyer;
    protected int price;
    public Cars(int km, int owners, Date testDate, String color, String[] images, String manufacturer, String model, int lp, String owner, Buyer buyer, int price) {
        setKm(km);
        setOwners(owners);
        setTestDate(testDate);
        setColor(color);
        setImages(images);
        setManufacturer(manufacturer);
        setModel(model);
        setLp(lp);
        setOwner(owner);
        setBuyer(buyer);
        setPrice(price);
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getOwners() {
        return owners;
    }

    public void setOwners(int owners) {
        this.owners = owners;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLp() {
        return lp;
    }

    public void setLp(int lp) {
        this.lp = lp;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
