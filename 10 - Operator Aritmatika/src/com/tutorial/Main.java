/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        OPERASI ARITMATIKA


            int var1 = 5;
            int var2 = 2;
            
            int hasil;
            
//            1.PENJUMALHAN

        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
            
//            2.PENGURANGAN

        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n", var1, var2, hasil );
        
//            3.PERKALIAN

        hasil = var1 * var2;
        System.out.printf("%d * %d = %d \n", var1, var2, hasil );

//            4.PEMBAGIAN

        hasil = var1 / var2;
        System.out.printf("%d / %d = %d \n", var1, var2, hasil );
        
        float a = 8;
        float b = 6;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);
        
//            5.MODULUS
                    
        // TODO code application logic here
    }
    
}
