/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++) {
            System.out.println("");
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
        }
        
            System.out.println("\n");
            
        for(int i = 0; i < 5; i++) {
            System.out.println("");
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
                if(i == j) {
                    break;
                }
            }
        }
        
            System.out.println("\n");
            
        for(int i = 0; i < 5; i++) { // I ke bawah vertikal
            System.out.println("");
            for(int j = 0; j < 5; j++) { // J ke kanan horizontal
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }            
        }
            System.out.println("\n");
        
                for(int i = 0; i < 9; i++) { // I ke bawah vertikal
            System.out.println("");
            for(int j = 0; j < 9; j++) { // J ke kanan horizontal
                System.out.print("* ");
                if (i==j) {
                    break;
                } else if ((i+j) == 8) {
                    break;
                }
            }            
        }
            System.out.println("\n");
            
            for(int i = 0; i < 5; i++){
                for (int j = 0; j < i; j++){
                    System.out.print("  ");
                }
                for(int k = 5; k > i; k--) {
                System.out.print("* ");
                }
                System.out.print("\n");               
            }
        
            System.out.println("\n");
            
            for(int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    System.out.print("  ");
                    if ((i+j) == 4) {
                        break;
                    }
                }
                for(int k = 0;k < 5; k++) {
                    System.out.print("* ");
                    if( k == i) {
                        break;
                    }
                }

                System.out.print("\n");               
            }
            
                System.out.print("\n");               
            
            for(int i = 0; i < 5; i++){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                for(int k = 5; k > i; k--) {
                System.out.print(" *");
                }
                System.out.print("\n");               
            }
        
//            System.out.println("\n");
            
            for(int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    System.out.print(" ");
                    if ((i+j) == 4) {
                        break;
                    }
                }
                for(int k = 0;k < 5; k++) {
                    System.out.print("* ");
                    if( k == i) {
                        break;
                    }
                }

                System.out.print("\n");               
            }
                
            System.out.println("\n");        
        // TODO code application logic here
    }
    
}
