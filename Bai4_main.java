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
import java.util.ArrayList;
import java.util.Scanner;
public class Bai4_main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so giao dich: ");
        int tonggiaodich =Integer.parseInt(sc.nextLine());

        Bai4_giaodichdat x = new Bai4_giaodichdat();
        Bai4_giaodichnha y = new Bai4_giaodichnha();
        ArrayList<Bai4_Giaodich> cacgiaodich = new ArrayList<>();
        for(int i =0; i<tonggiaodich;i++)
        {
            System.out.println("chon loai giao dich: 1-dat, 2-nha");
            int loaigiaodich = Integer.parseInt(sc.nextLine());
            if(loaigiaodich ==1)
            {
                x.nhapgiaodichdat();
                cacgiaodich.add(x);
            }
            if(loaigiaodich ==2)
            {
                y.nhapgiaodichnha();
                cacgiaodich.add(y);
            }
        }
        for(Bai4_Giaodich Do : cacgiaodich)
        {
            Do.hien();
            Do.thanhtien();
        }
    }
}
