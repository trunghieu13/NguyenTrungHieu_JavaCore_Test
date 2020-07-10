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
public class Bai6_Sach implements Serializable {
   private String masach, tensach, tacgia;
   private float gia;
   private int soluong;
  
   public Bai6_Sach(){}
   public Bai6_Sach(String masach,String tensach,String tacgia,float gia,int soluong)
   {
       this.masach = masach;
       this.tensach = tensach;
       this.tacgia = tacgia;
       this.gia=gia;
       this.soluong=soluong;
   }
    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public void nhap()
    {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        masach = scanner.nextLine();
        System.out.println("Nhap ten sach: ");
        tensach = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        soluong = scanner.nextInt();
        String c=scanner.nextLine();
        System.out.println("Nhap tac gia: ");
        tacgia =scanner.nextLine();
        System.out.println("Nhap gia: ");
        gia = scanner.nextFloat();
        String o =scanner.nextLine();
    }
    public void nhapgiahoadon()
    {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        tensach = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        soluong = scanner.nextInt();
        System.out.println("Nhap gia: ");
        gia = scanner.nextFloat();
    }
    public void hien()
    {
        System.out.printf("\n%8s",masach);
        System.out.printf("%8s",tensach);
        System.out.printf("%8s",tacgia);
        System.out.printf("%8n",soluong);
        System.out.printf("%8f",gia);
        System.out.println("");
    }

    @Override
    public String toString() {
        return  tensach + "  " +soluong+"  " ;
    }
   

   
    

   
    
   
}
