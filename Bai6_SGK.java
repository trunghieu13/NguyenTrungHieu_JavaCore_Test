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
public class Bai6_SGK extends  Bai6_Sach{
    private String lop;

    public Bai6_SGK() {
    }
    
    public String getLop() {
        return lop;
    }

    public Bai6_SGK(String lop, String masach, String tensach, String tacgia, float gia, int soluong) {
        super(masach, tensach, tacgia, gia, soluong);
        this.lop = lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap vao lop");
        lop = sc.nextLine();
    }
    
}
