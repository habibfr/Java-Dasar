/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Arrays;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {
    
    private static void  printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| = " + address);
    }
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // membuat String
        String kataString = "hallo";
        char[] kataChar = {'h','a','l','l','o'};
        
        //Menampilkan String 
        System.out.println(kataString);
        System.out.println(kataChar);
        
        // Mengaskses komponen dari String
        System.out.println("Komponen pertama dari char  = " + kataChar[1]);
        System.out.println("Komponen pertama dari char  = " + kataString.charAt(1));
        
        
        // mengubah komponen dari string
        // itu tidak bisa...kenapa? karena string di java bersifat imutable
        kataChar[0] = 'c'; 
        System.out.println(kataChar);
        
        // kataString[0] = 'c'; ----> tidak bisa
        // kataString.charAt(0) = 'c' ----> tidak bisa
        // tapi kita bisa mengubah secara tidak langsung
        
        printAddress("kataString",kataString);
        kataString = 'b' + kataString.substring(1,5);
        
        System.out.println(kataString);
        printAddress("kataString",kataString);
        
        // Memory Array pada String Java
        String str_1 = "hallo"; 
        String str_2 = "ballo";
        String str_3 = "hallost";
        str_3 = str_3.substring(0,5);
        
        printAddress("str_1 = ", str_1);
        printAddress("atr_2 = ", str_2);
        printAddress("atr_3 = ", str_3);
        
        // KESIMPULAN STRING DI JAVA
        // 1. String di java imutable
        // 2. String yang berada di String pool itu reuseable
        // 3. Memory nya lebih efisien
        // 4. Membuat String dengan method baru itu akan membuat address baru
        // 5. lebih dalam
        
        String str_4 = new String("hallo");
        printAddress("atr_4 = ", str_4);



    }
    
   
}
    
