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

public class Bai6_NhanVien extends Bai6_Person implements Serializable {

    private float luong;
    

    Bai6_NhanVien() {
    }

    Bai6_NhanVien(String ten, String sdt, String gioitinh, String ngaysinh, float luong) {
        super(ten, sdt, gioitinh, ngaysinh);
        this.luong = luong;
    }

    public void nhapnhanvien() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap luong: ");
        luong = scanner.nextFloat();
    }
  

    @Override
    public String toString() {
        return super.toString() + " Luong" + this.luong;
    }

}
