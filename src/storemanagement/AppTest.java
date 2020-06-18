/*
package storemanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số sinh viên: ");
        int n = sc.nextInt();

        ArrayList <Employee> employees = new ArrayList<>();
        for(int i=0; i<employees.size(); i++ )
        {
            System.out.println(" Nhập thông tin sinh viên thứ: " + (i+1) );
            System.out.println(" Nhập tên: ");
            String name = sc.nextLine();

            System.out.println(" Nhập tuổi: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println(" Nhập số chứng minh thư: ");
            String identificationNunber = sc.nextLine();
            System.out.println(" Nhập vị trí muốn làm: ");
            String vitri = sc.nextLine();
            if (vitri.equalsIgnoreCase("full time"))
            {
                System.out.println(" Nhập số ngày làm: ");
                int totalWorkingDays = sc.nextInt();

                System.out.println(" Nhập lương theo ngày: ");
                long  dailySalary = sc.nextLong();
                FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name, age, identificationNunber, totalWorkingDays,dailySalary);

            }
            else if(vitri.equalsIgnoreCase(" part time"))
            {
                System.out.println(" Nhập số ca làm: ");
                int totalWorkingShift = sc.nextInt();

                System.out.println(" Nhập lương cơ bản: ");
                long baseSalary = sc.nextLong();
                ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name,age,identificationNunber, totalWorkingShift, baseSalary);
            }



        }
    }
}
*/
