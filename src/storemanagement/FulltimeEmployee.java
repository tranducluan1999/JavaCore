/*
package storemanagement;

import java.util.Scanner;

public class FulltimeEmployee extends Employee{
    private int totalWorkingDays;
    private long dailySalary;




    @Override
    long getMealAllowance() {
        int mealAllowance = 2000000;
        return mealAllowance;
    }

    @Override
    long getSalaryRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lương theo ngày: ");
        dailySalary= sc.nextLong();
        return 0;
    }

    @Override
    int getWorkingCount() {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Nhập số ngày làm việc: ");
        totalWorkingDays = sc.nextInt();
        return totalWorkingDays;
    }


    public FulltimeEmployee(String name, int age, String identificationNunber) {
        super(name, age, identificationNunber);
    }

    public FulltimeEmployee(String name, int age, String identificationNunber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNunber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }
   @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println(" Nhập số ngày làm việc: ");
        int totalWorkingDays = sc .nextInt();

        System.out.println(" Nhập lương theo ngày: ");
        long dailySalary = sc.nextLong();

    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println(" Số ngày làm việc: " +  totalWorkingDays);
        System.out.println(" Lương theo ngày: " + dailySalary);

    }



}
*/
