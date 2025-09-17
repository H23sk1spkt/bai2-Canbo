package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Canbo {
    private String Hoten_103;
    private LocalDate Ngaysinh_103;
    private String Gioitinh_103;
    private String Diachi_103;
    // phương thức
    //hàm khơi tạo ko có đối số
    public Canbo(){

    }
    //hàm khởi tạo có đối số
    public Canbo(String Hoten_103, LocalDate Ngaysinh_103, String Gioitinh_103, String Diachi_103 ){
        this.Hoten_103=Hoten_103;
        this.Ngaysinh_103=Ngaysinh_103;
        this.Gioitinh_103=Gioitinh_103;
        this.Diachi_103=Diachi_103;
    }
    public void Nhaptt(Scanner sc){
        System.out.println("Nhập họ tên: ");
        Hoten_103=sc.nextLine();
        System.out.println("\tNhập ngày sinh: ");
        String Ngaysinh_103str=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ngaysinh_103=LocalDate.parse(Ngaysinh_103str,formatter);
        System.out.println("\tNhập giới tính: ");
        Gioitinh_103=sc.nextLine();
        System.out.println("\tNhập địa chỉ: ");
        Diachi_103=sc.nextLine();
    }
    public void Hienthi(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Họ và tên là "+ Hoten_103);
        System.out.println("Ngày sinh là "+ Ngaysinh_103.format(formatter));
        System.out.println("Giới tính là "+ Gioitinh_103);
        System.out.println("Địa chỉ là "+ Diachi_103);
    }
    public String getHoten_103(){
        return this.Hoten_103;
    }
    

    
}
