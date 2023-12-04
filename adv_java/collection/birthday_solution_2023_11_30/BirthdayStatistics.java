package adv_java.collection.birthday_solution_2023_11_30;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BirthdayStatistics {
    public static int countMembers(Set<Person> people){
        return people.size();
    }

    public static int getHappyMonth(Set<Person> people){
       int[] months = getMonthCounter(people);

        int maxValue = months[0];
        int maxIndex = 0; //will point to the month with the highest numbers of birthdays

        for (int counter=1;counter<months.length;counter++){
            if (maxValue<months[counter]){
                maxValue=months[counter];
                maxIndex=counter;
            }
        }

        return maxIndex+1;
    }

    public static int getSadlyMonth(Set<Person> people){
        int[] months = getMonthCounter(people);

        int minValue = months[0];
        int minIndex = 0;

        //iterate on array
        for (int counter=1;counter<months.length;counter++){
            if (minValue>months[counter]){
                minValue = months[counter];
                minIndex = counter;
            }
        }

        //return the month
        return minIndex+1;
    }

    //same code for sad and happy month
    private static int[] getMonthCounter(Set<Person> people){
        int[] months = new int[12]; //[0,0,0,0,0,0,0,0,0,0,0,0]

        //מערך מונים
        for(Person singlePerson:people){
            months[singlePerson.getBirthDay().getMonthValue()-1]++;
        }

        return months;
    }

    public static Map<Integer,Integer> getEvents(Set<Person> people){
        Map<Integer,Integer> events = new TreeMap<>();

        for (int counter=0;counter<12;counter++){
            events.put(counter+1,0);
        }

        for (Person singlePerson:people){
            int month = singlePerson.getBirthDay().getMonthValue();
//            if (events.containsKey(month)){
//                events.put(month, events.get(month)+1);
//            } else {
//                events.put(month,1);
//            }
            events.put(month, events.get(month)+1);
        }

        return events;
    }
}
