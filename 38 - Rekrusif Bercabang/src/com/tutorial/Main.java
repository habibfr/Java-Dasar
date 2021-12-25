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
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Nilai Fibonaci ke = ");
        int nilai = userInput.nextInt();
        
        
        int nilaiFibonacci = fibonacci(nilai,"atas");
        System.out.println("niali fibonacci ke - " + nilai + " adalah = " + nilaiFibonacci);
        
        
    }
    private static int fibonacci (int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke-" + n);
        if (n == 1 || n == 0){
            return n;
        } else {
        return fibonacci(n-1,"kiri") + fibonacci (n-2,"kanan");
        }
    }
    
    
    
    
    
    
    
    
    
}
