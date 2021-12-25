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
        
        int[][] matrix_a = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] matrix_b = {
            {22,12,13},
            {14,15,16},
            {17,18,19},
        };
        System.out.println("Matrix A");
        printArray(matrix_a);
        System.out.println("Matrix B");
        printArray(matrix_b);
        
        
       
        System.out.println("Hasil Matrix A + Matrix B");
        int[][] hasilTambah = tambah(matrix_a, matrix_b);
        printArray(hasilTambah);
        
        
        // Perkalian Matrix
        int[][] matrix_c = {
            {1,2},
            {3,4},
        };
        int[][] matrix_d = {
            {11,12},
            {13,14},
        };
        System.out.println("Matrix C");
        printArray(matrix_c);
        System.out.println("Matrix D");
        printArray(matrix_d);
        
        
        int baris_c = matrix_c.length;
        int kolom_c = matrix_c[0].length;
        
        int baris_d = matrix_d.length;
        int kolom_d = matrix_d[0].length;
        
        int[][] hasilKali = new int [baris_c][kolom_d];
        
        int buffer;
        for(int i = 0; i < baris_c; i++){
            for(int j = 0; j < kolom_d; j++){
                buffer = 0;
                for (int k = 0; k < kolom_c; k ++){
                    buffer += matrix_c[i][k] * matrix_d[k][j];
                }
                hasilKali[i][j] = buffer; 
            }
        }
        System.out.println("Hasil Matrix C * Matrix D");
        printArray(hasilKali);
        
        
    }
    private static int[][] tambah(int[][] matrix_1,int[][] matrix_2){
        int baris_1 = matrix_1.length;
        int kolom_1 = matrix_1[0].length;
        
        int baris_2 = matrix_2.length;
        int kolom_2 = matrix_2[0].length;
        
        int[][] hasil = new int [baris_1][kolom_2];
        
        if (baris_1 == baris_2 && kolom_1 == kolom_2){
            for(int i = 0; i < baris_1; i++){
                for(int j = 0; j < kolom_1; j++){
                hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }    
        }else{
            System.out.println("Jumlah Baris atau Kolom Tidak Sama");
        }
        return hasil;
    }
    
    private static void printArray(int[][] dataArray){
        
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        for(int i = 0; i < baris; i++){
            System.out.print("[");
            for(int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);
                
                if(j < (kolom-1)){
                    System.out.print(",");
                }else{
                    System.out.print("]");
                }                
            }
            System.out.print("\n");
        }
            System.out.print("\n");
    }
}
