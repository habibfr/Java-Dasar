/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutoria;
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
        
        int input,a;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan angka anda = ");
        input = userInput.nextInt();
        
       a = (input == 10) ? (input*input) : (input/2);
       
        System.out.println("jawaban nya adalah " + a);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
