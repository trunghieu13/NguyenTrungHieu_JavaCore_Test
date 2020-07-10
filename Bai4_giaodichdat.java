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
import java.util.Scanner;
public class Bai4_giaodichdat extends Bai4_Giaodich {
    private String loaidat;

    public Bai4_giaodichdat() {
        
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    public Bai4_giaodichdat(String magiaodich, String ngaygiaodich, float dongia, float dientich,String loaidat) {
        super(magiaodich, ngaygiaodich, dongia,dientich);
        this.loaidat = loaidat;
    }
    
    public void nhapgiaodichdat()
    {
        Scanner sc = new Scanner(System.in);
        nhap();
        System.out.println("Nhap loai dat: ");
        loaidat = sc.nextLine();
    }
 
    @Override
    public void thanhtien()
    {
       
        if(getLoaidat().compareToIgnoreCase("c")==0 || loaidat.compareToIgnoreCase("b")==0 )
        {
             total = getDongia()* getDientich();
             System.out.printf("Thanh tien: ",total);
        }
        else if(getLoaidat().compareToIgnoreCase("a")==0 )
        {
            total = (float) (getDongia()* getDientich() * 1.5) ;
            System.out.printf("Thanh tien: ",total);
        }
        
         
    }
    
    
   
}
