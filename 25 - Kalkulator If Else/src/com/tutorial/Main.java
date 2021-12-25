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
        
        float a,b,hasil;
        char operator;
        
        
        
        
        System.out.print("Masukan a = ");
        a = userInput.nextInt();
        System.out.print("Masukan Operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("Masukan b = ");
        b = userInput.nextInt();
        
        
//        pilihan operator

        if (operator == '+'){
            hasil = a + b;
            System.out.print("hasilnya adalah = " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("hasinya adalah = " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("hasinya adalah = " + hasil);
        } else if (operator == '/'){
            if(b == 0){
            System.out.println("pembagian 0 tak terhingga");
            } else {
                hasil = a / b;
            System.out.println("hasinya adalah = " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
