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
        
        int[] arrayAngka1 = {9,3,4,5,5,7,9,0,3};
        int[] arrayAngka2 = {3,3,5,6,7,6,8,6,8};
        
        
        // Menjumlahkan 2 buah Array
        int[] arrayHasil = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1,"array 1 = ");
        printArray(arrayAngka2,"array 2 = ");
        printArray(arrayHasil,"Hasil 1(+) = ");
        
       
        // Menggabungkan dua buah array 
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }
        for(int i = 0; i < arrayAngka2.length; i++){
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayHasil2,"hasil 2 = ");
        
        //Membalikan/Reversed array dan sort
        Arrays.sort(arrayAngka1);
        printArray(arrayAngka1,"array sort 1 = ");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "array reversed 1 = ");
        
        
        
        //Membalikan/Reversed array dan sort
        Arrays.sort(arrayAngka2);
        printArray(arrayAngka2,"array sort 2 = ");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "array reversed 2 = ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;
        for(int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }
    
    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for(int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }       
    }
    
    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for(int i = 0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }
    
    private static void printArray(int[] dataArray,String message){
        System.out.println(message + Arrays.toString(dataArray));
    }
}
