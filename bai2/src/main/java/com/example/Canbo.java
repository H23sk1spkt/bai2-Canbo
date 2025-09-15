package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Canbo {
    private String Hoten;
    private LocalDate Ngaysinh;
    private String Gioitinh;
    private String Diachi;
    // phương thức
    //hàm khơi tạo ko có đối số
    public Canbo(){

    }
    //hàm khởi tạo có đối số
    public Canbo(String Hoten, LocalDate Ngaysinh, String Gioitinh, String Diachi ){
        this.Hoten=Hoten;
        this.Ngaysinh=Ngaysinh;
        this.Gioitinh=Gioitinh;
        this.Diachi=Diachi;
    }
    public void Nhaptt(Scanner sc){
        System.out.println("Nhập họ tên: ");
        Hoten=sc.nextLine();
        System.out.println("\tNhập ngày sinh: ");
        String Ngaysinhstr=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ngaysinh=LocalDate.parse(Ngaysinhstr,formatter);
        System.out.println("\tNhập giới tính: ");
        Gioitinh=sc.nextLine();
        System.out.println("\tNhập địa chỉ: ");
        Diachi=sc.nextLine();
    }
    public void Hienthi(){
        System.out.println("Họ và tên là "+ Hoten);
        System.out.println("Ngày sinh là "+ Ngaysinh);
        System.out.println("Giới tính là "+ Gioitinh);
        System.out.println("Địa chỉ là "+ Diachi);
    }
    public String getHoten(){
        return this.Hoten;
    }
    

    
}
