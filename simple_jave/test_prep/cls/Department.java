package simple_jave.test_prep.cls;

import simple_jave.targil2_hw_28_09.Employee;

import java.util.Arrays;

public class Department {
    public static final String[] DEP_NAMES={"programming","qa","marketing","administration"};
    private String name;
    private Manager manager;
    private Worker[] workers;

    public Department(String name, Manager manager, Worker[] workers) {
        setName(name);
        setManager(manager);
        setWorkers(workers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //move on entire collection
        for (String item:DEP_NAMES){
            //check if item equals to name
            if (item.equals(name)){
                //update the name field
                this.name=item;
                //exit the function...
                return;
            }
        }
        this.name = "N/A";
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        if (workers.length>15){
            Worker[] tempWorkers=new Worker[15];
            //System.arraycopy(workers, 0, tempWorkers, 0, tempWorkers.length);
            for (int index=0;index< tempWorkers.length;index++){
                tempWorkers[index]=workers[index];
            }
            workers=tempWorkers;
        }
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
