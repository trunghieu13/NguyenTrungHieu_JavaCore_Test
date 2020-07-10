/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

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

/**
 *
 * @author Admin
 */
/*
   - quản lý cửa hàng bán sách
   - sử dụng: đóng gói, kế thừa, đọc ghi file,các thao tác trên arraylist
*/
public class Bai6_Main {
public static void main(String arg[]) throws IOException, FileNotFoundException, ClassNotFoundException
    {
    
    Scanner scanner = new Scanner(System.in);
    Bai6_DSHD hoadon = new Bai6_DSHD();
    Bai6_DSKH khachhang = new Bai6_DSKH();
    Bai6_DSNV nhanvien = new Bai6_DSNV();
    Bai6_DSsgk sgk = new Bai6_DSsgk();
         
    int n = 100, b = 100;
    do
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("0: thoat");
        System.out.println("1: nhan vien");
        System.out.println("2: khach hang");
        System.out.println("3: hoa don");
        System.out.println("4: sgk");
        n = sc.nextInt();
        switch(n){
            case 1:
                do{
                    System.out.println("-----------------------------");
                    System.out.println("0:thoat");
                    System.out.println("1: nhap thong tin nhan vien");
                    System.out.println("2:luu vao file");
                    System.out.println("3:doc file");
                    b = sc.nextInt();
                    switch(b)
                    {
                        case 1:
                            nhanvien.nhapdsnv();
                            break;
                        case 2:
                            nhanvien.ghiFileDSNV();
                            break;
                        case 3:
                            nhanvien.hienFileDSNV();
                            break;
                        case 0: break;
                        default: System.out.println(" moi nhap lai: ");
                            break; 
                            
                            
                    }
                }while(b!=0);
            case 2:
                do{
                    System.out.println("-----------------------------");
                    System.out.println("0:thoat");
                    System.out.println("1: nhap thong tin khach hang");
                    System.out.println("2:luu vao file");
                    System.out.println("3:doc file");
                    System.out.println("4:tim kiem khach hang");
                    System.out.println("5:xoa theo ma khach hang");
                    b = sc.nextInt();
                    switch(b)
                    {
                        case 1:
                            khachhang.nhapdskh();
                            break;
                        case 2:
                            khachhang.ghiFileDSKH();
                            break;
                        case 3:
                            khachhang.hienFileDSKH();
                            break;
                        case 4 :
                            khachhang.timkiemma();
                        case 5:
                            khachhang.xoama();
                            
                        case 0: break;
                        default: System.out.println(" moi nhap lai: ");
                            break; 
                            
                            
                    }
                
                }while(b!=0);
            case 3:
                do{
                    System.out.println("-----------------------------");
                    System.out.println("0:thoat");
                    System.out.println("1: nhap thong tin hoa don");
                    System.out.println("2:luu vao file");
                    System.out.println("3:doc file");
                    System.out.println("4:tim kiem hoa don");
                    System.out.println("5:tim kiem theo ma nhan vien");
                    System.out.println("6: tinh tong tien hoa don");
                    System.out.println("7.tinh tien theo mnv");
                    b = sc.nextInt();
                    switch(b)
                    {
                        case 1:
                            hoadon.nhapds();
                            break;
                        case 2:
                            hoadon.ghiFileDSHD();
                            break;
                        case 3:
                            hoadon.hienFileDSHD();
                            break;
                        case 4 :
                            hoadon.timkiem();
                            break;
                        case 5:
                            hoadon.hiendstheomnv();
                            break;
                        case 6:
                            hoadon.tongtiencachoadon();
                            break;
                        case 7:
                                hoadon.tinhtongtienhoadonMNV();
                            break;
                            
                        case 0: break;
                        default: System.out.println(" moi nhap lai: ");
                            break; 
                            
                            
                    }
                
                }while(b!=0);
            case 4:
                do{
                    System.out.println("-----------------------------");
                    System.out.println("0:thoat");
                    System.out.println("1: nhap sgk");
                    System.out.println("2: hien sgk");
                    System.out.println("2: tim ds");
                     b = sc.nextInt();
                     switch(b)
                     {
                         case 1:
                             sgk.nhapds();
                             break;
                         case 2:
                             sgk.hiends();
                             break;
                         case 3:
                             sgk.timsachtheolop();
                             break;
                         
                         
                         
                        case 0: break;
                        default: System.out.println(" moi nhap lai: ");
                            break; 
                     }
                    
                    
                }while(b!=0);
                
        }
        
    }while(n!=0);
    
}
}

