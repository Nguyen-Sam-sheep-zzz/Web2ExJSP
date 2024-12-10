package com.example.ex2web.Model;

public class Staff {
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    private double salary;

    public Staff(int id, String name, int age, String position, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}