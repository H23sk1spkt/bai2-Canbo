package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Nhanvien extends Canbo {
    public String Congviec_103;
    //hàm khơi toa ko doi so
    public Nhanvien(){

    }
    //hàm khởi tạo có đối số
    //Super dai dien cho kieu ham "Canbo103" co doi so
    public Nhanvien(String Hoten, LocalDate Ngaysinh, String Gioitinh, String Diachi,String Congviec_103 ) {
        super(Hoten,Ngaysinh,Gioitinh,Diachi);
        this.Congviec_103=Congviec_103;
    }
    // Ham nhap thong tin hien thi
    public void Nhaptt(Scanner sc){
        super.Nhaptt(sc);
        System.out.println("Nhap Cong viec");
        Congviec_103=sc.nextLine();
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Cong viec la"+Congviec_103);
    }
}
