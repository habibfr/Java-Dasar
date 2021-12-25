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
        
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];
        
        System.out.println("Library sebelum disamkan");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        //aray sebelum disamkan dengan array lain
        System.out.println("\n Array sebelum disamakan");
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
//        System.out.println(Arrays.toString(arrayAngka1));
//        System.out.println(Arrays.toString(arrayAngka2));
        
        arrayAngka2 = arrayAngka1;
        
        System.out.println("\n Library setelah disamkan");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        // array setelah di samakan dengan array lain
        System.out.println("\n Array setelah disamakan");
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
        
        arrayAngka2[2] = 399;
        arrayAngka1[3] = 500;

        // array setelah di samakan dengan array lain
        System.out.println("\n Array setelah disamakan");
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
        
        
        System.out.println("\n Array diubah oleh fungsi lain");
        ubahArray(arrayAngka1);
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
    }
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 100;
    }
    
}
