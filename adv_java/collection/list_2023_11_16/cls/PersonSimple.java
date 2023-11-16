package adv_java.collection.list_2023_11_16.cls;

//lombok
//to install lombok
// file>Settings>Plugins
// click Browse repositores....
// search for lombok plugin
// click on install plugin
// restart intellij

// @annotation name

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor          //default constructor
@AllArgsConstructor         //all argument contructor
//@RequiredArgsConstructor    //constructor will be build according to the data we will pass
//toString, Equal, HashCode, getter settering
@Data
public class PersonSimple {
    private String name;
    private int age;
    private boolean isMarried;
    private String address;
    private boolean hasCar;
    private int income;
    private boolean isMale;
    private String id;
    private boolean homeOwner;
    private int flatNumber;
    private int floor;
    private int kids;

    public void setAge(int age) {
        this.age = age*12;
    }
}
