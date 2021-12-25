/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // mengambil komponen dari string
        String kalimat = "hallo, saya habib!!";
        System.out.println(kalimat);
        
        //substring  
        String kata = kalimat.substring(12,17);
        System.out.println(kata);
        
        // concatenation (concat)
        String kalimat2 = "selamat pagi " + kata;
        System.out.println(kalimat2);
        
       // menimpa variable baru
       kata = kata + " ganteng";
        System.out.println(kata);
        
        // concat dengan non string 
        int jumlah = 100;
        String kalimat3 = kata + " " + jumlah + " %";
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah + " %");
        
        // LowerCase dan UpperCase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        // replace
        String kalimat4 = kalimat.replace("habib!!", "Stress!!");
        System.out.println(kalimat);
        System.out.println(kalimat4);
        
        
        //equality String
//        String kataInput = "test"; // ini pada string pool
        String kataInput = new String("test"); // ini bukan string pool walaupun mempunyai kata yang sama
        String kataTest = "test"; // ini pada string pool
        
        // cara membandingkan string berdasarkan lokasi memory
        System.out.println("\nPersamaan pada lokasi string pool");
        if(kataInput == kataTest){
            System.out.println("SAMA");
        }else {
            System.out.println("TIDAK SAMA");
        }
        
        
        // mengecek dan mengecek berdasarkan kata string nya
//        Scanner UserInput = new Scanner(System.in);
//        System.out.println("\nMasukan kata yang ingin di cek = ");
//        kataInput = UserInput.next();
//        if(kataInput.equels(kataTest)){
//            System.out.println("SAMA");
//        }else {
//            System.out.println("TIDAK SAMA");
//        }
//        


        // Compare // Membandingkan string berdasarkan alphabeta
        String motor1 = "Honda repsol 125";
        String motor2 = "Kawasaki Ninja 125R";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));
        
        
        // jika sama akanmaju ke huruf yang berbeda
        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));
        
    }
    
}
