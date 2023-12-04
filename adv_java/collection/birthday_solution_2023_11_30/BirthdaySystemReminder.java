package adv_java.collection.birthday_solution_2023_11_30;

import java.security.Security;
import java.util.*;

public class BirthdaySystemReminder {
    private BirthDayTask task;
    private Set<Person> people;
    private static Scanner scanner;

    public BirthdaySystemReminder(){
        people = new HashSet<>();
        task = new BirthDayTask(people);
        Thread thread = new Thread(task);
        thread.start();
        //thread will be terminated upon program closing.... (user/unchecked exception run time error)
        thread.setDaemon(true);
        startSystem();
    }

    public void showMenu(){
        System.out.println("Birthday System Menu\n"+
                "============================\n"+
                "1. Add Person\n"+
                "2. Delete Person\n"+
                "3. Print All People\n"+
                "4. Print People Count\n"+
                "5. Print Happy Month\n"+
                "6. Print Sad Month\n"+
                "7. Print Events\n"+
                "0. Exit System\n"
                );
    }

    public void startSystem(){
        System.out.println("System was started !!! \n");
        while (true){
            showMenu();
            System.out.print("> ");
            String input = scanner.nextLine();
            System.out.println();
            switch (input){
                case "1":
                    addPerson(new Person());
                    break;
                case "2":
                    System.out.println("Please insert id of person to delete");
                    System.out.print("> ");
                    int id = scanner.nextInt();
                    deletePerson(id);
                    break;
                case "3":
                    printAll();
                    break;
                case "4":
                    printCountMembers();
                    break;
                case "5":
                    printHappyMonth();
                    break;
                case "6":
                    printSadlyMonth();
                    break;
                case "7":
                    printEvents();
                    break;
                case "0":
                    endSystem();
                    break;
                default:
                    System.out.println("Invalid Input! please try again:\n");
                    break;
            }
        }
    }

    private void endSystem() {
        scanner.close();
        System.out.println("Birthday reminder ended !!!!");
        System.exit(0);
    }

    private void printEvents() {
        Map<Integer,Integer> events = BirthdayStatistics.getEvents(people);
        for (Integer key: events.keySet()){
            //System.out.println("Month: "+String.format("%2d",key)+" number of birthdays "+events.get(key));
            //System.out.println("Month: "+(key<10?"0":"")+key+" number of birthdays "+events.get(key));
            System.out.printf("Month: %2d -> number of birthday %d\n",key,events.get(key));
        }
    }

    private void printSadlyMonth() {
        int sadMonth = BirthdayStatistics.getSadlyMonth(people);
        System.out.println("The sadly month (more money to plumbir): "+sadMonth);
    }

    private void printHappyMonth() {
        int happyMonth = BirthdayStatistics.getHappyMonth(people);
        System.out.println("The happy month (most expensive month): "+happyMonth);
    }

    private void printCountMembers() {
        System.out.println("There is "+BirthdayStatistics.countMembers(people)+" in the system");
    }

    private void printAll() {
        if (this.people.size()==0){
            System.out.println("No pepole in the system :(");
            return;
        }
        List<Person> people = new ArrayList<>(this.people);
        Collections.sort(people);
        System.out.println(people);
    }

    private void deletePerson(int id) {
        for (Person person:people){
            if (person.getId()==id){
                people.remove(person);
                System.out.println("person was erased !!!!!!");
                break;
            }
        }
    }

    private void addPerson(Person person){
        if (people.add(person)){
            System.out.println("Person was add!!!!\n");
        } else {
            System.out.println("Person already exists !!!!!\n");
        }
    }
}
