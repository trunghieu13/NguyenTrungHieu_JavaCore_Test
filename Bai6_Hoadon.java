/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Serializable;

public class Bai6_Hoadon implements Serializable {
    //mahd, ngaylap, makh, mnv, Arraylist <Sanpham>
    private String mahd,ngaylap,makh,mnv;
    ArrayList<Bai6_Sach> X  = new ArrayList<>();
    public String getMahd() {
        return mahd;
       
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
        
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }
    //mahd, ngaylap, makh, mnv, Arraylist <Sanpham>
    public void nhap()
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma hd: ");
        mahd = scanner.nextLine();
        System.out.println("Nhap vao ngay lap: ");
        ngaylap = scanner.nextLine();
        System.out.println("Nhap vao ma kh: ");
        makh = scanner.nextLine();
        System.out.println("Nhap vao ma nv: ");
        mnv = scanner.nextLine();
        System.out.println("nhap vao so san pham: ");
        int n = Integer.parseInt(scanner.nextLine());      
        for(int i = 0 ; i < n ; i++)
        {
            
            Bai6_Sach y = new Bai6_Sach();
            y.nhapgiahoadon();   
            X.add(y);
            
        }
    }
    public float tinhtien()
    {
        float tongtien = 0;
//        float a=0;
        for(Bai6_Sach i : X)
        {
            tongtien += i.getSoluong()*i.getGia();
//            a= tongtien;
//            System.out.print(""+a);
//            tongtien=0;
        }
        return tongtien;
        
         
    }
      public void hien()
    {
        
        System.out.printf("\n%8s",mahd);
        System.out.printf("%8s",ngaylap);
        System.out.printf("%8s",makh);
        System.out.printf("%8s",mnv);
        for(Bai6_Sach i:X)
        {
            System.out.print(" "+i.toString());
            
            System.out.println("                          ");
            
            
            
//            float tongtien = 0;
//            i.hien1();
//            tongtien += i.getSoluong()*i.getGia();
//            System.out.println(" "+tongtien);
            
            
        } 
       
    }

    @Override
    public String toString() {
        return "Hoadon{" + "mahd=" + this.mahd + ", ngaylap=" + this.ngaylap + ", makh=" + this.makh + ", mnv=" + this.mnv + ", X=" + X + '}';
    }
    
}
