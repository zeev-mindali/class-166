package simple_jave.exam_oop.cls;

import java.util.Arrays;

public class School {
    private ClassRoom[] classrooms;

    public School(ClassRoom[] classrooms) {
        setClassrooms(classrooms);
    }

    public ClassRoom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ClassRoom[] classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "School{" +
                "classrooms=" + Arrays.toString(classrooms) +
                "}\n";
    }
}
