package com.besant.core.collections;

public class Students{
    private int id;
    private String name;
    private String gender;
    private int marks;
    private boolean pass;

    public Students(int id, String name, String gender, int marks, boolean pass) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getMarks() {
        return marks;
    }

    public boolean isPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                ", pass=" + pass +
                '}';
    }
}
