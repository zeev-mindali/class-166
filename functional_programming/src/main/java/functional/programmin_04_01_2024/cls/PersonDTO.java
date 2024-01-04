package functional.programmin_04_01_2024.cls;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//data to object, alexy you can jump :)
public class PersonDTO {
    private final Integer id;
    private final String name;
    private final Integer age;

    public static PersonDTO map(org.example.streams.beans.Person person){
        return new PersonDTO(
                person.getId(),
                person.getFirstName(),
                person.getAge()
        );
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }
}
