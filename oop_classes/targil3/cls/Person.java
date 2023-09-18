package oop_classes.targil3.cls;

public class Person {
    private String name;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person[] thin2fat(Person[] persons){
        Person[] sortedPerson = copyArray(persons);
        for (int mainLoop=1;mainLoop< sortedPerson.length;mainLoop++){
            for (int sortLoop=0;sortLoop< sortedPerson.length-mainLoop;sortLoop++){
                if(sortedPerson[sortLoop].getWeight()>sortedPerson[sortLoop+1].getWeight()){
                    Person temp=sortedPerson[sortLoop];
                    sortedPerson[sortLoop]=sortedPerson[sortLoop+1];
                    sortedPerson[sortLoop+1]=temp;
                }
            }
        }
        return sortedPerson;
    }

    public Person[] high2low(Person[] persons){
       Person[] sortedPerson = copyArray(persons);
       for (int mainLoop=1;mainLoop<sortedPerson.length;mainLoop++){
           for (int sortLoop=0;sortLoop<sortedPerson.length-mainLoop;sortLoop++){
               if (sortedPerson[sortLoop].getHeight()<sortedPerson[sortLoop+1].getHeight()){
                   Person temp = sortedPerson[sortLoop];
                   sortedPerson[sortLoop]=sortedPerson[sortLoop+1];
                   sortedPerson[sortLoop+1]=temp;
               }
           }
       }
       return sortedPerson;
    }

    private Person[] copyArray(Person[] person){
        Person[] newPerson = new Person[person.length];
        for (int index=0;index<person.length;index++){
            newPerson[index]=new Person();
            newPerson[index].name = person[index].name;
            newPerson[index].weight = person[index].weight;
            newPerson[index].height = person[index].height;
        }
        return newPerson;
    }

    public String show(){
        return "Name:"+this.name+" Height:"+this.height+" Weight:"+this.weight;
    }

}
