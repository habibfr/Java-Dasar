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
        System.out.println("=====Membuat Game Tebakan======");
        
        Scanner userInput = new Scanner(System.in);
        int angkaBenar = 8;
        int angkaTebakan;
        
        
//        input

        System.out.print("Masukkan Tebakan Anda = ");
        angkaTebakan = userInput.nextInt();
        System.out.println("Tebakan Anda = " + angkaTebakan);
        
//        proses
        System.out.println("Jawaban benarnya = " + angkaBenar);
        
//        ouput
        if (angkaBenar == angkaTebakan){
            System.out.println("Selamat anda benar");
        } else {
            System.out.println("Maaf anda salah");       
        }        
        
        System.out.println("=======Game pilihan angka terbatas=========");
        
//        variable
             
        int angkaPilihan;       
        
//        input   
        System.out.print("Masukkan angka >4 dan <10 = ");  
        angkaPilihan = userInput.nextInt();
        System.out.println("pilihan anda = " + angkaPilihan);

//        proses
        if ((angkaPilihan  > 4 ) && (angkaPilihan <10)){
            System.out.println("selamat angka pilihan anda tersedia");
        } else {
            System.out.println("maaf angka pilihan anda tidak tersedia");
        }

//        output
        System.out.println("terima kasih telah memilih game ini");
             
      // TODO code application logic here
    }
    
}
