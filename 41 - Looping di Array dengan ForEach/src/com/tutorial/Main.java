/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Arrays;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20,21};
        
        //Looping Standard
        System.out.println("Looping Sederhana");
        for(int i = 0; i < 10; i++){
            System.out.println("Ini adalah index array ke-" + i + " dengan nilai = " + arrayAngka[i]);
        }

        // Looping dengan properti array
        System.out.println("\n Looping dengan properti array");
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.println("Ini adalah inex array ke-" + i + " dengan nilai = " + arrayAngka[i]);
        }
        
        
        //Looping dengan forEach 
        System.out.println("\n Looping dengan forEach");
        for(int angka : arrayAngka){
            System.out.println("ini adalah angka = " + angka);
        }
        











    }
    
}
