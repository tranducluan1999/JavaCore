package storemanagement;

import java.util.Scanner;

public abstract class Employee {
    private String name;
    private int age;
    private String identificationNunber;

    public Employee() {
    }

    public Employee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
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

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }
    abstract long getMealAllowance();
    abstract long getSalaryRate();
    abstract int getWorkingCount();
    public  long calculateSalary(long catulate)
    {
        catulate = getWorkingCount() * getSalaryRate() + getMealAllowance();
        return catulate;

    }


    public abstract void nhap();
}
