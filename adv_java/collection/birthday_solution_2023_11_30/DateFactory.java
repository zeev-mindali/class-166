package adv_java.collection.birthday_solution_2023_11_30;

import java.time.LocalDate;

public class DateFactory {
    public static LocalDate getLocalDate(){
        int day = (int)((Math.random()*28)+1);     //1-28       =>Day
        int month = (int)((Math.random()*12)+1);   //1-12       =>Month
        int year = (int)((Math.random()*51)+1960); //1960-2010  =>Year
        LocalDate date = LocalDate.of(year,month,day);
        return date;
    }
}
