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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
    nằm trong đoạn 10 và 200 (tính cả 10 và 200). Các số thu được sẽ được in thành chuỗi
    trên một dòng, cách nhau bằng dấu phẩy.
    */
 
    public static void main(String[] args) {
        
        for(int i =10;i<=200;i++)
        {
            if((i%7==0)&&(i%5!=0))
            {
                System.out.print(i + ",");
            }
        }
    }
    
}
