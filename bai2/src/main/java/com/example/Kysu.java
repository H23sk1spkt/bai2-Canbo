package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Kysu extends Canbo {
    public String Nganh_103;
    //hàm khơi toa ko doi so
    public Kysu(){

    }
    //hàm khởi tạo có đối số
    //Super dai dien cho kieu ham "Canbo103" co doi so
    public Kysu(String Hoten, LocalDate Ngaysinh, String Gioitinh, String Diachi,String Nganh_103 ) {
        super(Hoten,Ngaysinh,Gioitinh,Diachi);
        this.Nganh_103=Nganh_103;
    }
    // Ham nhap thong tin hien thi
    public void Nhaptt(Scanner sc){
        super.Nhaptt(sc);
        System.out.println("Nhap Nganh");
        Nganh_103=sc.nextLine();
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Nganh la"+Nganh_103);
    }
}
