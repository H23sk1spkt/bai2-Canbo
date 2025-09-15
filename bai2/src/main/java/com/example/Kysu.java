package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Kysu extends Canbo {
    public String Nganh;
    //hàm khơi toa ko doi so
    public Kysu(){

    }
    //hàm khởi tạo có đối số
    //Super dai dien cho kieu ham "Canbo" co doi so
    public Kysu(String Hoten, LocalDate Ngaysinh, String Gioitinh, String Diachi,String Nganh ) {
        super(Hoten,Ngaysinh,Gioitinh,Diachi);
        this.Nganh=Nganh;
    }
    // Ham nhap thong tin hien thi
    public void Nhaptt(Scanner sc){
        super.Nhaptt(sc);
        System.out.println("Nhap Nganh");
        Nganh=sc.nextLine();
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Nganh la"+Nganh);
    }
}
