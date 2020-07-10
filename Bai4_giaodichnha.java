/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4_giaodichnha extends Bai4_Giaodich {
    private String loainha,diachi;

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public Bai4_giaodichnha()
    {
        
    }

    public Bai4_giaodichnha(String loainha, String diachi, String magiaodich, String ngaygiaodich, float dongia, float dientich) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.loainha = loainha;
        this.diachi = diachi;
    }
    public void nhapgiaodichnha()
    {
        Scanner sc = new Scanner(System.in);
        nhap();
        System.out.println("Nhap loai nha: ");
        loainha = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
    }
  
     @Override
    public void thanhtien()
    {
        float total = 0;
        if(getLoainha().compareToIgnoreCase("cao cap")==0  )
        {
             total = getDongia()* getDientich();
        }
        else if(getLoainha().compareToIgnoreCase("thuong")==0 )
        {
            total = (float) (getDongia()* getDientich() * 0.9) ;
        }
        System.out.printf("Thanh tien: ",total);
       
    }
    
    
}
