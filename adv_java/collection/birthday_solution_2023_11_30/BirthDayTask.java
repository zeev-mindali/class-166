package adv_java.collection.birthday_solution_2023_11_30;

import java.time.LocalDate;
import java.util.Set;

public class BirthDayTask implements Runnable{
    private final Set<Person> people;
    //                              MS*S*M*H
    public static final int TIME = 1000*60*60*24;

    public BirthDayTask(Set<Person> people){
        this.people=people;
    }

    private boolean isBirthDayMonth(Person person){
        return person.getBirthDay().getMonth() == LocalDate.now().getMonth();
    }

    private boolean isBirthDayDay(Person person){
        return person.getBirthDay().getDayOfMonth() == LocalDate.now().getDayOfMonth();
    }
    @Override
    public void run() {
        while (true){
            boolean found=false;
            for (Person person:people) {
                if (isBirthDayDay(person) && isBirthDayMonth(person)) {
                    found = true;
                    System.out.println(person.getName() + " have a birthday today (" +
                            DateUtil.beautifyDate(person.getBirthDay()) + "), wish him happy birthday.\n");
                }
            }
            if (!found){
                System.out.println("Today no one has a birthday :( no cake to eat");
            }
            try {
                Thread.sleep(TIME); //system resources
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
