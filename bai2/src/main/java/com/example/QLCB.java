package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<Canbo103> dscb;
    public QLCB(){
        dscb=new ArrayList<Canbo103>(10);
    }
    public void themcb(Canbo103 cb){
        dscb.add(cb);
    }
    public void Nhaptt(Scanner sc){
        Canbo103 cb;
        System.out.println("Nhập số lượng cán bộ");
        int n=sc.nextInt();
        int chon;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thong tin can bo thứ"+(i+1)+"\t 1.Kỹ sư \t 2.Công nhân\t 3.Nhân viên\t");
            chon=sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    cb=new Kysu();
                    break;
                case 2:
                    cb=new Congnhan();
                    break;
                case 3:
                    cb=new Nhanvien();
                    break;
                default:
                    cb=new Kysu();
                    break;
            }
            cb.Nhaptt(sc);
            themcb(cb);
        }
    }
    public void Hienthi(){
        for (Canbo103 cb : dscb) {
            cb.Hienthi();
        }
    }
    public void Timkiem(String Hoten){
        for (Canbo103 cb: dscb){
            if(Hoten.equals(cb.getHoten())){
                cb.Hienthi();
            }
        }
    }
}
