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
        
        System.out.println("Mengubah Array menjadi string");
        int[] arrayAngka1 = {1,2,3,4,5};
        printArray(arrayAngka1);
        
        
        
        System.out.println("\nMengcopy Array ");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nMengcopy Array dengan Looping");
        for(int i=0;i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        System.out.println("\nMengcopy Array dengan CopyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        System.out.println("\nmengcopy Aray dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        System.out.println("\nFill array");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);
        
        System.out.println("\nMembandingkan Array dengan komparasi equels");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,1,4,5};
               
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        
        System.out.print(Arrays.equals(arrayAngka6, arrayAngka7) + ", ");
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("itu array yang sama");
        }else{
            System.out.println("itu array yang berbeda");
        }

        System.out.println("\nMembandingkan dua buah array");
//        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        System.out.println("Mencari Arrays yang berbeda");
//        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
        

        System.out.println("\nmensortir/Mengurutkan Array");
        int[] arrayAngka8 = {3,5,6,3,5,6,1,2,3,7,8,9};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        System.out.println("\nMencari/Search angka/nilai/index di dalam array");
        int angka = 5;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("nilai " + angka + " terdapat pada index ke = " + posisi);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public static void printArray(int[] dataArray){
        
        System.out.println("array = " + Arrays.toString(dataArray));

    }
}
