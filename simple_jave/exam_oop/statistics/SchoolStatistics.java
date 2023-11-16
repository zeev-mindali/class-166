package simple_jave.exam_oop.statistics;

import simple_jave.exam_oop.cls.*;

import java.util.Random;


public class SchoolStatistics {
    private static School school;
    private static String[] profession = {"math", "chemistry", "geography", "literature", "physics", "sports"};

    public static void main(String[] args) {
        School school = getSchool();
        System.out.println(school);
        System.out.println("==================================");
        System.out.println(SchoolStatistics.getAvg(school));
        System.out.println("==================================");
        for (ClassRoom classRoom: school.getClassrooms()){
            System.out.println(classRoom.getName()+": "+classRoom.getAvg());
        }
        System.out.println("==================================");
        //clac
        int[] avg = new int[SchoolStatistics.profession.length];
        for (int index=0;index<avg.length;index++){
            for (ClassRoom classRoom: school.getClassrooms()){
                for (Student student: classRoom.getStudents()){
                    avg[index] += student.getSingleGrade(index);
                }
            }
        }
        //display result
        for (int index=0;index<SchoolStatistics.profession.length;index++){
            int totalGrade = school.getClassrooms()[0].getStudents().length*school.getClassrooms().length;
            System.out.println(SchoolStatistics.profession[index]+" : "+avg[index]/totalGrade);
        }
        Person person = new Person("zeev",49);

    }
    public static School getSchool(){
        ClassRoom[] classRooms=new ClassRoom[5];

        for (int classIndex=0;classIndex<5;classIndex++){
            Student[] students = getStudents();
            ClassRoom singleClass = new ClassRoom(
                        "class"+(classIndex+1),
                            getTeacher(classIndex),
                            getStudents()
            );
            classRooms[classIndex] = singleClass;
        }
        return new School(classRooms);
    }
    private static Teacher getTeacher(int index){
        Random rnd = new Random();
        return new Teacher("Teacher"+(index+1),
                rnd.nextInt(100)+20,
                SchoolStatistics.profession[index]
                );
    }

    private static Student[] getStudents(){
        Student[] students = new Student[15];

        Random rnd = new Random();

        for (int studentIndex=0;studentIndex<students.length;studentIndex++){

            students[studentIndex] = new Student(
                    "student"+(studentIndex+1),
                    rnd.nextInt(100)+20,
                    getGrades()
                    );
        }
        return students;
    }

    public static Grade[] getGrades(){
        Random rnd = new Random();
        Grade[] grades = new Grade[6];
        for (int grade=0;grade<SchoolStatistics.profession.length;grade++){
            grades[grade] = new Grade(SchoolStatistics.profession[grade],rnd.nextInt(60)+40);
        }
        return grades;
    }

    private static int getAvg(School school){
        int avg=0;
        for (ClassRoom classRoom:school.getClassrooms()){
            avg+= classRoom.getAvg();
        }
        return avg/school.getClassrooms().length;
    }


}
