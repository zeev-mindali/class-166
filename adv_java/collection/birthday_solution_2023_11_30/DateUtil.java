package adv_java.collection.birthday_solution_2023_11_30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String beautifyDate(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


}
