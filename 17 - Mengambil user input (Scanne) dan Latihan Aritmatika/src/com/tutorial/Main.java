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
        
        
        int panjang, lebar, tinggi, hasil;
        
        System.out.print("Masukan angka panjang = ");
        Scanner userInput = new Scanner(System.in);
        panjang = userInput.nextInt();

        System.out.print("Masukan angka lebar = ");
        lebar = userInput.nextInt();
        
        System.out.print("Masukan angka tinggi = ");
        tinggi = userInput.nextInt();

        hasil = panjang * lebar * tinggi;
        System.out.println("hasil volume " + panjang + " X " + lebar + " X " + tinggi + " anda = " + hasil);
        
        
        
//        membuat alat hitung luas persegi panjang
//        luas = panjang x lebar
//        int panjang = 10;
//        int lebar = 5;
//        int luas = panjang * lebar;
//        System.out.println(luas);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
