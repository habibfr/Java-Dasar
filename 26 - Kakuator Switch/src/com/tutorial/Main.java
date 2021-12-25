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
        
        Scanner userInput;
        float a,b,hasil;
        String operator;
        
        userInput = new Scanner(System.in);
        System.out.print("masukan a = ");
        a = userInput.nextFloat();
        System.out.print("masukan operator = ");
        operator = userInput.next();
        System.out.print("masukkan nilai b = ");
        b = userInput.nextFloat();
        
        switch(operator){
            case "+":
                hasil = a+b;
                System.out.println("hasinya adalah = " + hasil);
            break;
            case "-":
                hasil = a-b;
                System.out.println("hasinya adalah = " + hasil);
            break;
            case "*":
                hasil = a*b;
                System.out.println("hasinya adalah = " + hasil);
            break;
            case "/":
                if(b==0){
                    System.out.println("pembagian 0 tak terhingga");
                } else {
                hasil = a/b;
                System.out.println("hasinya adalah = " + hasil);   
                }
            break;
            default:
                System.out.println("operator tidak ditemukan");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
