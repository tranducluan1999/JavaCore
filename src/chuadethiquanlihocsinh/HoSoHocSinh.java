package chuadethiquanlihocsinh;

import java.util.Scanner;

public class HoSoHocSinh extends HocSinh{

    private String lop;
    private String khoahoc;
    private String kyhoc;

    public HoSoHocSinh()
    {

    }
    public HoSoHocSinh(String hoten, String masv, String namsinh, String quequan) {
        super(hoten, masv, namsinh, quequan);
    }

    public HoSoHocSinh(String lop, String khoahoc, String kyhoc) {
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.kyhoc = kyhoc;
    }

    public HoSoHocSinh(String hoten, String masv, String namsinh, String quequan, String lop, String khoahoc, String kyhoc) {
        super(hoten, masv, namsinh, quequan);
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.kyhoc = kyhoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(String kyhoc) {
        this.kyhoc = kyhoc;
    }
    @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println(" Nhập lớp: ");
        this.lop = sc.nextLine();

        System.out.println(" Nhập khóa học: ");
        this.khoahoc =sc .nextLine();

        System.out.println(" Nhâp kỳ học: ");
        this.kyhoc = sc.nextLine();
    }

    @Override
    public void xuat()
    {

        super.xuat();
        System.out.println(" Lớp: "+this.lop);
        System.out.println(" Khóa học: "+ this.khoahoc);
        System.out.println(" Kỳ học: "+ this.kyhoc);
    }
}
