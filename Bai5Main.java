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
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
public class Bai5Main {
    ArrayList<Bai5> DSKH ;
    
    Scanner input = new Scanner(System.in);
  public void nhapDSKH(ArrayList<Bai5> DSKH)
    {
        int n;
        int i;
        
        System.out.println("Nhap so khach hang: ");
        n = input.nextInt();
        DSKH = new ArrayList<>(n);
        for (i=0;i<n;i++)
        {
            Bai5 x = new Bai5();
            x.nhap();
            DSKH.add(x);
        }
    }

    public static void write(Bai5 p){
        try {            
            FileOutputStream fout = new FileOutputStream("khachhang.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(p);          
            out.close();
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static Bai5 read(){
        Bai5 p = null;
        try {         
            FileInputStream fin = new FileInputStream("khachhang.dat");
            ObjectInputStream in = new ObjectInputStream(fin);           
            p =(Bai5) in.readObject();       
            fin.close();
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return p;
    }
    public static void writeList(ArrayList<Bai5> DSKH){
        try {        
            FileOutputStream fout = new FileOutputStream("DSKH.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);      
            out.writeObject(DSKH);         
            out.close();
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static ArrayList<Bai5> readList(){
        ArrayList<Bai5> result = null;
        try {         
            FileInputStream fin = new FileInputStream("DSKH.dat");
            ObjectInputStream in = new ObjectInputStream(fin);       
            result = (ArrayList<Bai5>)in.readObject();       
            fin.close();
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bai5Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    
    
    
    public static void main(String args[])
    {
        ArrayList<Bai5> DSKH = new ArrayList<>();
        Bai5Main Do = new Bai5Main();
        Do.nhapDSKH(DSKH);
        System.out.println("Ghi danh sach vao file ");
        Bai5Main.writeList(DSKH);
        System.out.println("Doc du lieu tu file ");
        ArrayList<Bai5> result = Bai5Main.readList();
        Iterator<Bai5> it = result.iterator();
        while(it.hasNext()){
            System.out.println(""+it.next().toString());
    }
    }
}
