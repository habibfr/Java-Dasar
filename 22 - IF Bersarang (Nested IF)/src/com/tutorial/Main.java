/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Scanner;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=======start======");
        
//        #variable
        int a,b,c;
        
        Scanner userInput = new Scanner(System.in);
       
        
        
//        input
        System.out.print("MASUKAN ANGKA PERTAMA = ");
        a = userInput.nextInt();
        
        System.out.print("MASUKAN ANGKA KE DUA = ");
        b = userInput.nextInt();
        
        System.out.print("MASUKAN ANGKA KE DUA = ");
        c = userInput.nextInt();
//        
//        
//        System.out.println("ANGKA YANG ANDA MASUKAN " + a + " Dam " + b);
//        
//        
////        proses
//        
//        if (a == 6 ){
//            if ( b == 8 ){
//                System.out.println("ini aksi dengan a & b benar");
//            } else {
//                System.out.println("ini default dengan a benar dan b salah");
//            }
//        } else {
//            System.out.println("ini adalah default ke dua");
//        }
//        
////        output
//        
//        System.out.println("======finish======");
//        
//        
//        
        if (a == 1){
            if (b == 2){
                System.out.println("INI ADALAH STAMENT 4 DENGAN A FALSE DAN B TRUE");
            } if (c == 3){
                System.out.println("ini statment 2 dgn a b fasle c true");
            } else {
                System.out.println("ini statment 3 dgn a b c false");
            }
        } else {
            System.out.println("INI STATMENT 1 dgn a salah b c terabaikan");
        }
        
        System.out.println("========INI FINISHH=======");






















        
        
        
        
        // TODO code application logic here
    }
    
}
