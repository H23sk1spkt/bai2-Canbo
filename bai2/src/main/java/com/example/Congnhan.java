package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Congnhan extends Canbo {
    public String Bac_103;
    //hàm khơi toa ko doi so
    public Congnhan(){

    }
    //hàm khởi tạo có đối số
    //Super dai dien cho kieu ham "Canbo103" co doi so
    public Congnhan(String Hoten, LocalDate Ngaysinh, String Gioitinh, String Diachi,String Bac_103 ) {
        super(Hoten,Ngaysinh,Gioitinh,Diachi);
        this.Bac_103=Bac_103;
    }
    // Ham nhap thong tin hien thi
    public void Nhaptt(Scanner sc){
        super.Nhaptt(sc);
        System.out.println("Nhap bac");
        Bac_103=sc.nextLine();
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Bac la"+Bac_103);
    }
}
