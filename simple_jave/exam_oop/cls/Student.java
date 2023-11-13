package simple_jave.exam_oop.cls;

import java.util.Arrays;

public class Student extends Person{
    private Grade[] grades;

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        setGrades(grades);
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }

    public int getAvg(){
        int avg=0;
        for (Grade grade:grades){
            avg+=grade.getScore();
        }
        return avg/ grades.length;
    }

    public int getSingleGrade(int index){
        return grades[index].getScore();
    }
}
