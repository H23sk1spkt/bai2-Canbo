package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB ql = new QLCB();
        int chon;

        do {

            System.out.println("1. Nhập thông tin cán bộ");
            System.out.println("2. Hiển thị thông tin cán bộ");
            System.out.println("3. Tìm kiếm thông tin theo tên");
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> ql.Nhaptt(sc);
                case 2 -> ql.Hienthi();
                case 3 -> {
                    sc.nextLine(); // Xử lý xuống dòng
                    System.out.print("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    ql.Timkiem(name);
                }
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (chon != 0);

        sc.close();
    }
}
