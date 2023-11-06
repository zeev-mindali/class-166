package simple_jave.exam_prep_2.cls;

import simple_jave.MyObject.Car;

import java.util.Arrays;

public class Migrash {
    private String manager;
    private String address;
    private String tel;
    private int capacity;
    private Cars[] cars;

    public Migrash(String manager, String address, String tel, int capacity, Cars[] cars) {
        setManager(manager);
        setAddress(address);
        setTel(tel);
        setCapacity(capacity);
        setCars(cars);
        Company.setTotalCar(Company.getTotalCar()+cars.length);
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity<0){
            this.capacity=0;
        }
        this.capacity = capacity;
    }

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        if (cars.length<=this.capacity) {
            this.cars = cars;
        } else {
            System.out.println("the total of cars is over the capacity");
        }
    }

    @Override
    public String toString() {
        return "Migrash{" +
                "manager='" + manager + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", capacity=" + capacity +
                ", cars=" + Arrays.toString(cars) +
                "}\n";
    }

    public int getCheapCar(){
        int low = Integer.MAX_VALUE;
        for (Cars item:cars){
            if (item.price<low){
                low=item.price;
            }
        }
        return low;
    }
    public int getTotalMoney(){
        int result = 0;
        for (Cars item:cars){
            result+=item.price;
        }
        return result;
    }
}
