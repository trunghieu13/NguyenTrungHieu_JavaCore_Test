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
import java.util.Scanner;
public class Bai6_DSsgk {
    ArrayList<Bai6_SGK> DS = new ArrayList<>();
    public void nhapds()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("so sach muon nhap: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Bai6_SGK x = new Bai6_SGK();
            x.nhap();
            DS.add(x);
        }
    }
    public void hiends()
    {
        for(Bai6_SGK i : DS)
        {
            System.out.println(""+i.toString());
        }
    }
    public void timsachtheolop()
    {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap lop muon tim:");
        String n = sc.nextLine();
        for(Bai6_SGK i:DS)
        {
            if(i.getLop().compareToIgnoreCase(n)==0)
            {
                System.out.println(""+i.toString());
                c++;
            }
            if(c==0)
            {
                System.out.println("Khong co.");
            }
        }
    }
}
