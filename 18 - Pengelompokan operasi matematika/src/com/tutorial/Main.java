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
    public static void main(String[] args){
            
//           MEMBUAT PENGHITUNG PERSAMAAN KUADRAT
//            1.BUAT VARIABLE M,X,C DAN HASIL (RUMUS)
            int m, x, c,hasil;

//            PANGGIL LIBRARY NYA            
            Scanner userInput = new Scanner(System.in);
                     
//            2.SURUH USER INPUT
            System.out.print("Masukan Nilai m = ");
            m = userInput.nextInt();

            System.out.print("Masukan Nillai X = ");
            x = userInput.nextInt();
            
            System.out.print("Masukan Nilai C = ");
            c = userInput.nextInt();
            
//            3.PROSES OLEH RUMUS          
            hasil = (m*x*x)+ c;
            
            
//            4.OUTPUT RUMUS            
            System.out.println("jawaban nya = " + hasil);
       
        
//        System.out.print("");
//        Scanner userInput = new Scanner(System.in);


//import java.util.Scanner; ini ambil di atas
//Scanner.userInput = new Scanner(System.in); ini panggillllll fungsi nya
//variable = userInput.nextInt(); ini perintah nya
//
//
//import java.util.Scanner;
//Scanner userInput = new Scanner(System.in);
//variable = userInput.nextInt();
//
//import java.util.Scanner;
//Scanner userInput = new Scanner(System.in);
//variable = userInput.nextInt();
//
//
//import java.util.Scanner;
//Scanner userInput = new Scanner(System.in);
//variable = userInput.nextInt();
//
//import java.util.Scanner;
//Scanner userInput =new Scanner(System.in);
//variable = userInput.nextInt;
//
//
//import java.util.Scanner;
//Scanner userinput = new Scanner(System.in);
//variable = userInput.nextInt();



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
