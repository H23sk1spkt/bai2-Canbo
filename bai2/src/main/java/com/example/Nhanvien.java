package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Nhanvien extends Canbo {
    public String Congviec;
    //hàm khơi toa ko doi so
    public Nhanvien(){

    }
    //hàm khởi tạo có đối số
    //Super dai dien cho kieu ham "Canbo" co doi so
    public Nhanvien(String Hoten, LocalDate Ngaysinh, String Gioitinh, String Diachi,String Congviec ) {
        super(Hoten,Ngaysinh,Gioitinh,Diachi);
        this.Congviec=Congviec;
    }
    // Ham nhap thong tin hien thi
    public void Nhaptt(Scanner sc){
        super.Nhaptt(sc);
        System.out.println("Nhap Cong viec");
        Congviec=sc.nextLine();
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Cong viec la"+Congviec);
    }
}
