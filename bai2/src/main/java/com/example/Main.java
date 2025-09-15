package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QLCB ql=new QLCB();
        int chon;
        do { 
            
            System.out.println("1.Nhập thồng tin \t 2.Hiển thị thông tin\t Tìm kiếm thồng tin theo tên ");
            chon=sc.nextInt();
            switch (chon) {
                case 1:
                    ql.Nhaptt(sc);
                    break;
                case 2:
                    ql.Hienthi();      
                    break;
                case 3:
                    System.out.println("Nhập tên cần tìm ");
                    sc.nextLine();
                    String name =sc.nextLine();
                    ql.Timkiem(name);
                    break;
                default:
                    break;
            }
        } while (chon!=0);
    }
}