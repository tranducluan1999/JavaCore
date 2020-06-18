package chuadethiquanlihocsinh;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiHocSinh {



    public static void main(String[] args) {
        ArrayList<HoSoHocSinh> hoso = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        HoSoHocSinh hoSoHocSinh = new HoSoHocSinh();
        System.out.println(" Nhập số học sinh");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(" Nhập thông tin cho học sinh thứ: " + (i+1));
            hoSoHocSinh.nhap();
            hoso.add(hoSoHocSinh);
        }
        System.out.println(" thông tin học sinh");
        System.out.println(hoso);
    }
}
