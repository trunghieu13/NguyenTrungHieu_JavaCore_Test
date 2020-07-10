/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
/*
+ Giao dịch đất: Mã giao dịch, ngày giao dịch (ngày, tháng, năm), đơn giá, loại đất (loại A, B, C), diện tích.
– Nếu là loại B, C thì: thành tiền = diện tích * đơn giá.
– Nếu là loại A thì: thành tiền = diện tích * đơn giá * 1.5
+ Giao dịch nhà: Mã giao dịch, ngày giao dịch (ngày, tháng, năm), đơn giá, loại nhà (cao cấp, thường), địa chỉ, diện tích.
– Nếu là loại nhà cao cấp thì: thành tiền = diện tích * đơn giá.
– Nếu là loại thường thì: thành tiền = diện tích * đơn giá * 90%
Đã sử dụng:
+ Kế thừa
+ Đóng gói
+ Trừu tượng

*/
import java.util.Scanner;
public abstract class Bai4_Giaodich {
    private String magiaodich,ngaygiaodich;
    private float dongia, dientich;
    protected float total = 0;
    
    
    public Bai4_Giaodich() {
    }

    public Bai4_Giaodich(String magiaodich, String ngaygiaodich, float dongia, float dientich, char loaidat) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
        
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public Bai4_Giaodich(String magiaodich, String ngaygiaodich, float dongia, float dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }
    

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

 
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma giao dich:");
        magiaodich = sc.nextLine();
        System.out.println("Nhap ngay giao dich: ");
        ngaygiaodich = sc.nextLine();
        System.out.println("Nhap don gia: ");
        dongia = sc.nextFloat();
        System.out.println("Nhap dien tich: ");
        dientich = sc.nextFloat();
    }
    public void hien()
    {
        System.out.printf("%8s",magiaodich);
        System.out.printf("%8s",ngaygiaodich);
        System.out.printf("%8.2f",dongia);
        System.out.printf("%8.2f",dientich);
    }
    public abstract void thanhtien();
    
   
}
