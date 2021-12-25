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
        System.out.print("masukan nama siswa ");
        
        String a = userInput.next();
        
        
        
        switch(a){
            case "hilmi":
                System.out.println("hilmi hadir boss!!");
                break;
            case "dilan":
                System.out.println("dilan hadir bos!!!");
                break;
            case "mario":
                System.out.println("mario hadir boss!!1");
                break;
            default:
                System.out.println(a + " tidak masuk bos!!!");     
        }
        
        
        int c = 6;
        
        if(c > 9){
            if(c%2 == 0){
                System.out.println("ini angka lebih besar dari 9 dan genap");
            } else {
                System.out.println("ini angka lebih dari 9 dan ganjil");
            }
        }else {
            System.out.println("angka anda kurang dari 10");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
