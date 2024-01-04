package org.example.streams.beans;

public class Car {
    private final Integer id;
    private final String make;
    private final String mode;
    private final String color;
    private final Integer year;
    private final Double price;

    public Car(Integer id, String make, String mode, String color, Integer year, Double price) {
        this.id = id;
        this.make = make;
        this.mode = mode;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getMode() {
        return mode;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", mode='" + mode + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
