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
        
        
        // MEmbuat Array dangan Assignment
        System.out.println(" Belajar Arrays Multi Dimensi Dengan Asignment");
        int[][] array_2D =
            { 
                {2,3},
                {4,5} 
            };
        printArray(array_2D);
        
        
        // Membuat array dimensi dengan deklarasi
        // [baris][kolom]
        System.out.println("\n Membuat Array 2 Dimensi Dengan Deklarasi");
        int[][] arrayAngka = new int[5][4];
        printArray(arrayAngka);
        
        //array dimensi dengan looping manual
        System.out.println("\n Membuat Array 2 Dimensi Dengan Looping Manual");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayAngka[i].length; j++){
                System.out.print(arrayAngka[i][j] + ",");
            }
            System.out.print("]\n");
        }
        
        
        //Membuat Array 2 Dimensi dengan ForEach
        System.out.println("\n Membuat Array 2 Dimensi dengan Looping ForEach");
        printArray(arrayAngka);
        
//        for(int[] baris : arrayAngka){
//            System.out.print("[");
//            for(int kolom : baris){
//                System.out.print(kolom + ",");
//            }
//            System.out.print("]\n");
//        }


        // Pembuktian array 2 Dimensi
        System.out.println("\nContoh Array 2 DImensi");
        int[][] array_2D_2 = {
            {1,2,3,4,5,6},
            {9,8,7,6,5,5,4,4},
            {8,4,5,3,3},
            {3,5,67,7},
            {3,4}         
        };
        printArray(array_2D_2);
        







        System.out.println("");
        
        
        
    }
    private static void printArray(int[][] dataArray){
      for(int[] baris : dataArray){
            System.out.print("[");
            for(int kolom : baris){
                System.out.print(kolom + ",");
            }
            System.out.print("]\n");
        }  
    }
}
