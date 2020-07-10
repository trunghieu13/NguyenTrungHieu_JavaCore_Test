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

public class Bai6_DSNV {

    ArrayList<Bai6_NhanVien> DSNV1 = new ArrayList<Bai6_NhanVien>();
   ArrayList<Bai6_NhanVien> tmp2 = new ArrayList<>();

    public void nhapdsnv() {
        int n;
         Scanner scanner = new Scanner(System.in);
        System.out.println("so nhan vien can nhap: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Bai6_NhanVien x = new Bai6_NhanVien();
            x.nhapnhanvien();
            DSNV1.add(x);
            
        }
        
        

    }

    public void hiendsnv() {
        for(Bai6_NhanVien i : DSNV1)
        {
            System.out.println(" "+i.toString());
        }
    }
    void ghiFileDSNV() throws IOException{
        File file = new File("DSNV.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try (FileOutputStream FOS = new FileOutputStream(file); 
                ObjectOutputStream OOS = new ObjectOutputStream(FOS)) {
            OOS.writeObject(DSNV1);
            OOS.close();
            FOS.close();
        }
    }
    void hienFileDSNV() throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File("DSNV.txt");
        FileInputStream FIS = new FileInputStream(file);
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        tmp2 = (ArrayList<Bai6_NhanVien>) OIS.readObject();
        for(Bai6_NhanVien i : tmp2){
            System.out.println(""+i.toString());
            System.out.println();
        }
    }

    
    
}
