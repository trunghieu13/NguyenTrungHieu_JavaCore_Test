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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;

public class Bai6_DSKH {

    ArrayList<Bai6_Khachhang> dskh = new ArrayList<Bai6_Khachhang>();
    ArrayList<Bai6_Khachhang> tmp2 = new ArrayList<>();
    int n;
    
    public void nhapdskh() {
         Scanner sc = new Scanner(System.in);
        System.out.println("So khac hang muon nhap: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Bai6_Khachhang x = new Bai6_Khachhang();
            x.nhapkhachhang();
            dskh.add(x);
        }
    }

void ghiFileDSKH() throws IOException{
        File file = new File("DSKH.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try (FileOutputStream FOS = new FileOutputStream(file); 
                ObjectOutputStream OOS = new ObjectOutputStream(FOS)) {
            OOS.writeObject(dskh);
            OOS.close();
            FOS.close();
        }
    }
    void hienFileDSKH() throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File("DSKH.txt");
        FileInputStream FIS = new FileInputStream(file);
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        tmp2 = (ArrayList<Bai6_Khachhang>) OIS.readObject();
        for(Bai6_Khachhang i : tmp2){
            System.out.println(""+i.toString());
            System.out.println();
        }
    }
    
    
    public void hiendskh() {
        for (Bai6_Khachhang i : dskh) {
            System.out.println(i.toString());
        }
    }

    public void timkiemma() {
         Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma can tim kiem");
        String ma = sc.nextLine();
        System.out.println("Danh sach khach hang can tim kiem");
        for(Bai6_Khachhang kh : dskh){
            if(ma.compareToIgnoreCase(kh.getMa()) == 0){
                System.out.println(kh.toString());
            }
        }
    }

    public void xoama() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can xoa: ");
        String t = sc.nextLine();
        for (Bai6_Khachhang i : dskh) {
            if (i.getMa().compareToIgnoreCase(t) == 0) {
                dskh.remove(i);
            }
        }
    }

}
