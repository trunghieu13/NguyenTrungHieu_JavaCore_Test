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
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
public class Bai6_DSHD implements Serializable {
    ArrayList<Bai6_Hoadon> DSHD1  = new ArrayList<>();
    ArrayList<Bai6_Hoadon> tmp2 = new ArrayList<>();
    
    public void nhapds()
    {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("So hoa don muon nhap: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i =0;i<n;i++)
        {
            Bai6_Hoadon x = new Bai6_Hoadon();
            x.nhap();
            DSHD1.add(x);
        }
    }
//    public float tinhtien1()
//    {
//        float tongtien = 0;
//        for(Hoadon i:DSHD1)
//        {
//            tongtien=  i.tinhtien();
//        }
//        return tongtien;
//    }
    public void hiends()
    {
        for(Bai6_Hoadon i:DSHD1)
        {
            i.hien();
            System.out.println(" "+i.tinhtien());
        }
    }

    void ghiFileDSHD() throws IOException{
        File file = new File("DSHD.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try (FileOutputStream FOS = new FileOutputStream(file); 
                ObjectOutputStream OOS = new ObjectOutputStream(FOS))
        {
            OOS.writeObject(DSHD1);
            OOS.close();
            FOS.close();
        }
    }
    void hienFileDSHD() throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File("DSHD.txt");
        FileInputStream FIS = new FileInputStream(file);
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        tmp2 = (ArrayList<Bai6_Hoadon>) OIS.readObject();
        for(Bai6_Hoadon i : tmp2){
            i.hien();
            System.out.println();
            System.out.printf(" "+i.tinhtien());
        }
    }
    
    
    
    public void timkiem()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma can tim kiem: ");
        String t = scanner.nextLine();
        System.out.println("Ma can tim la: ");
        for(Bai6_Hoadon i :DSHD1)
        {
            if(i.getMahd().compareToIgnoreCase(t)==0)
            {
                i.hien();
            }
        }
        
    }
    public void hiendstheomnv()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MNV can tim: ");
        String t = scanner.nextLine();
        for(Bai6_Hoadon i: DSHD1)
        {
            if(i.getMnv().compareToIgnoreCase(t)==0)
            {
                System.out.println(" "+i.toString());
            }
        }
    }
    public void xoatheoma()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma can xoa: ");
        String t = scanner.nextLine();
        
        for(int i =0;i<DSHD1.size();i++)
        {
           if(DSHD1.get(i).getMahd().compareToIgnoreCase(t)==0)
           {
               DSHD1.remove(i);
           }
        }
    }
    public void them()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hoa don muon them: ");
        int t = scanner.nextInt();
        for(int i = 0 ; i<t ; i ++)
        {
            Bai6_Hoadon x = new Bai6_Hoadon();
            x.nhap();
            DSHD1.add(x);
        }
    }
    //indshd co tien > 100000
    public void indshd()
    {
        for(Bai6_Hoadon i : DSHD1)
        {
            if(i.tinhtien()>1000)
            {
                i.hien();
            }
        }
    }
    public void tongtiencachoadon()
    {
        int tien = 0;
        for(Bai6_Hoadon i:DSHD1)
        {
            tien += i.tinhtien();
        }
    }
    public void tinhtongtienhoadonMNV()
    {
        Scanner sc = new Scanner(System.in);int c =0;float tongtien = 0;
        System.out.println("nhap vao mnv: ");
        String n = sc.nextLine();
        for(Bai6_Hoadon i: DSHD1)
        {
            if(i.getMnv().compareToIgnoreCase(n)==0)
            {
                tongtien += i.tinhtien();
                c++;
            }
           
        }
        if(c==0)
        {
            System.out.println("khong co mnv nay.");
        }
        System.out.println("tong tien la "+tongtien);
    }
    
 

}
