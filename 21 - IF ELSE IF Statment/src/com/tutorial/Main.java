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
//        
//        System.out.println("START");
//        
//        int a = 7;
//        
//        
//        if(a == 5){
//            System.out.println("ini adalah aksi 1");
//        } else if ((a >= 6) && (a <= 10)) {
//            System.out.println("ini adalah aksi 2");
//        } else {
//            System.out.println("ini adalah aksi default");
//        }
//        
//        System.out.println("FINISH");
        
        
        Scanner userInput = new Scanner(System.in);
        int a,b,c;
        System.out.print("MASUKAN ANGKA A = ");
        a = userInput.nextInt();
        System.out.print("MASUKAN ANGKA B = ");
        b = userInput.nextInt();
        System.out.print("MASUKAN ANGKA C = ");
        c = userInput.nextInt();

        
        if(a == 1) {
            if (b == 2) {
                System.out.println("INI PERINTAH 1 ");
            } else {
                System.out.println("INI PERINTAH 2");
            }
        } else if(c == 3) {
            System.out.println("INI PERINTAH 3");
        }else{
            System.out.println("INI PERINTAH 4");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
