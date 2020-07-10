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
import java.io.Serializable;
import java.util.Scanner;

public class Bai6_Person implements Serializable {

    private String ten, sdt, gioitinh, ngaysinh;
    

    public Bai6_Person() {

    }

    public Bai6_Person(String ten, String sdt, String gioitinh, String ngaysinh) {
        this.ten = ten;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.ten = input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaysinh = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gioitinh = input.nextLine();
        System.out.println("Nhap sdt: ");
        this.sdt = input.nextLine();
    }

    @Override
    public String toString() {
        return "Ten : " + this.ten + " Ngay sinh : " + this.ngaysinh + " Gioi tinh " + this.gioitinh + " SDT : " + this.sdt;
    }

}
