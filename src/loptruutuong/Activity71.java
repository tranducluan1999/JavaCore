package loptruutuong;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> arrayList = new ArrayList<String>(2);
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Orange");
        arrayList.add("White");
        arrayList.add("Black");

        System.out.println(" Cac phan tu cua ArrayList la: ");

        for(String i : arrayList)
        {
            System.out.println(i);
        }
        System.out.println(" Mời bạn nhấn phím 1 để thêm phần tử Yellow vào vị trí thứ 3 của mảng: ");
        int n = sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println(" Mảng mới là: ");
                arrayList.add(2,"Yellow");
                for (String a : arrayList)
                {
                    System.out.println(a);
                }
                break;
            default:
                System.out.println(" Bạn đã nhập sai, thoát chương trình");
                break;

        }


    }
}
