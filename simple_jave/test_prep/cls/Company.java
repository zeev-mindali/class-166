package simple_jave.test_prep.cls;

import java.util.Arrays;

public class Company {
    Department[] departments;

    public Company(Department[] departments) {
        setDepartments(departments);
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        if (departments.length>3){
            Department[] tempDep = new Department[3];
            for (int index=0;index<3;index++){
                tempDep[index]=departments[index];
            }
            departments=tempDep;
        }
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}
