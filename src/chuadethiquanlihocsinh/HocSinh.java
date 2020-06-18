package chuadethiquanlihocsinh;

import java.util.Scanner;

public class HocSinh {
    private String hoten;
    private String masv;
    private String namsinh;
    private String quequan;


    public HocSinh() {
    }

    public HocSinh(String hoten, String masv, String namsinh, String quequan) {
        this.hoten = hoten;
        this.masv = masv;
        this.namsinh = namsinh;
        this.quequan = quequan;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập họ tên");
        this.hoten = sc .nextLine();

        System.out.println(" Nhập mã học sinh: ");
        this.masv = sc .nextLine();

        System.out.println(" Nhập năm sinh: ");
        this.namsinh = sc.nextLine();

        System.out.println(" Nhập quê quán: ");
        this.quequan = sc.nextLine();
    }
    public void xuat()
    {
        System.out.println(" Họ tên: " + this.hoten);
        System.out.println(" Mã học sinh: " + this.masv);
        System.out.println(" Năm sinh: " + this.namsinh);
        System.out.println(" Quê quán: " + this.quequan);

    }
}
