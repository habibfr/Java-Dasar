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
        
        System.out.println(" Menampilkan array multi dimensi dengan Assignment");
        int[][] array_2D = {
            {1,2,3,4,5},
            {6,7,8,9},
        };
        System.out.println(array_2D);
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(Arrays.toString(array_2D[0]));
        System.out.println(Arrays.toString(array_2D[1]));
        System.out.println(Arrays.deepToString(array_2D));
        
        
        
        System.out.println("\n Menampilkan array multi dimensi dengan deklarasi");
        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e'};
        
        char[][] arrayChar_2D = {
            array_char1,
            array_char2,
        };
        System.out.println(arrayChar_2D);
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.toString(arrayChar_2D[0]));
        System.out.println(Arrays.toString(arrayChar_2D[1]));
        System.out.println(Arrays.deepToString(arrayChar_2D));
        
        
        // gak bisa buat campuran!!!!
//        char[] array_char3 = {'x','y','z'};
//        int[] array_int1 = {7,8,9};
//        
//        int[][] array_campuran = {
//            array_char3,array_int1
//        };
    }
    
}
