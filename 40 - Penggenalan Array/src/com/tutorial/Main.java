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
    public static void main(String[] args) {
        
        /* 
           
           Array adalah kumpulan data primitif
           cara buat --> tipeData[]nama = {1 ,2 ,3 ,4 }
           ex --> int [] arrayAngka = {1, 2, 3, 4}
           int a = arrayAngka[0] --> 1
           arrayAngka[1] --> 10
           hasil akhir {1, 10, 3, 4}
        
        */
        
        // Assignment 
        // tipr data [] nama = {komponen]
        
        System.out.println("Assignment Array");
        
        
        //           index ke 0, 1, 2, 3
        //                    |  |  |  |
        int[] arrayInteger = {1, 2, 3, 4};
        
        arrayInteger[0] = 11;
        
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        
        
        // Deklarasi 
        // Tipe Data[] nama = nenw int[JumlahArray];
        
        System.out.println("Deklarasi Array");
        
        float[] arrayFloat = new float[5];
        
        arrayFloat[3] = 11.5f;
        arrayFloat[0] = 11;
        
        
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        
        
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
        
        
        
        
    }
    
}
