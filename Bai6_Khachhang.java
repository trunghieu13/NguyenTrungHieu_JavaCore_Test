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
import java.util.Scanner;
import java.io.Serializable;

public class Bai6_Khachhang extends Bai6_Person implements Serializable {

    private String ma;
    

    public Bai6_Khachhang() {
    }

    public Bai6_Khachhang(String ten, String sdt, String gioitinh, String ngaysinh, String ma) {
        super(ten, sdt, gioitinh, ngaysinh);
        this.ma = ma;
    }
    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void nhapkhachhang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        this.ma = scanner.nextLine();
        super.nhap();

    }

    @Override
    public String toString() {
        return  " Ma : " + this.ma + this.getTen() + this.getNgaysinh() + this.getGioitinh() +this.getSdt() ;
    }
}
