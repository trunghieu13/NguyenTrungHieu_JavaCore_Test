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
/*
    -Ghi 1 danh sách khách hàng vào file.
*/
import java.util.Scanner;
import java.io.Serializable;
public class Bai5 implements Serializable {
     private String CMND,ten,gaden;
    private double giatien;
    Scanner input = new Scanner(System.in);
    
public Bai5(){}
public Bai5(String CMND, String ten,String gaden, Double giatien)
{
    this.CMND = CMND;
    this.ten=ten;
    this.giatien=giatien;
    this.gaden=gaden;
}
    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGaden() {
        return gaden;
    }

    public void setGaden(String gaden) {
        this.gaden = gaden;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }
    
    public void nhap()
    {
        System.out.println("Ten khach hang:");
        ten = input.nextLine();
        System.out.println("So CMND: ");
        CMND = input.nextLine();
        System.out.println("Ga den: ");
        gaden = input.nextLine();
        System.out.println("Gia tien: ");
        giatien = input.nextDouble();
    }
    public void hien()
    {
        System.out.printf("\n%8s",ten);
        System.out.printf("%8s",CMND);
        System.out.printf("%8s",gaden);
        
    }

    @Override
    public String toString() {
        return "KhachHang{" + "CMND=" + CMND + ", ten=" + ten + ", gaden=" + gaden + ", giatien=" + giatien + ", input=" + input + '}';
    }
}
