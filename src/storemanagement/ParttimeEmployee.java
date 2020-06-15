package storemanagement;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class ParttimeEmployee extends Employee{




    @Override
    long getMealAllowance() {
        return 0;
    }

    @Override
    long getSalaryRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lương cơ bản: ");
        baseSalary = sc.nextLong();
        return baseSalary;
    }

    @Override
    int getWorkingCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số ca làm việc: ");
        totalWorkingShift = sc.nextInt();
        return totalWorkingShift;
    }
    private int totalWorkingShift;
    private long baseSalary;

    public ParttimeEmployee(String name, int age, String identificationNunber) {
        super(name, age, identificationNunber);
    }

    public ParttimeEmployee(String name, int age, String identificationNunber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNunber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();

        System.out.println(" Nhập số ca làm việc: ");
        int totalWorkingShift = sc.nextInt();

        System.out.println(" Nhập lương theo ca làm việc: ");
        long baseSalary = sc.nextLong();
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println(" Số ca làm việc: " + totalWorkingShift);
        System.out.println(" Nhập lương "  + baseSalary);
    }
}
