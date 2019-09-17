package com.stackroute;

public class Student {
    private int ID;
    private int Age;
    private String Name;

    public Student(int ID, int Age, String Name){
        this.ID = ID;
        this.Age = Age;
        this.Name = Name;
    }
    public void setAge(int age) {
        this.Age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public int getAge() {
        return this.Age;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }
}
