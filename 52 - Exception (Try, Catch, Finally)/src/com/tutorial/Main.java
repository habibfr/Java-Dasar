/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("Nilai Array ke : ");
        int index = userInput.nextInt();
        
        // Exception Handling (Try, Catch, Finally)
        System.out.println("Handling Out of Bound");
        try{
        System.out.printf("Index ke-%d, Nilanya adalah %d\n",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        
        // Exception file tidak ditemukan
        System.out.println("Handling file not found");
        try{
            fileInput = new FileInputStream("input.txt");
        }catch(IOException e){
            System.err.println(e);
        }
        
        // Menggabungkan dua try
        System.out.println("\nMenggabungkan dua Handling");
        try{
            System.out.printf("Index ke-%d, Nilanya adalah %d\n",index,array[index]);
            fileInput = new FileInputStream("input.txt");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak tersedia");
        }catch(IOException e){
            System.err.println("file tidak ditemukan");
        }
        
        
        //Manmbahkan finally
        System.out.println("\nException Finally");
        try{
            System.out.printf("Index ke-%d, Nilanya adalah %d\n",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak tersedia");
        }finally{
            System.out.println("finally");
        }
        
        
        
        
        System.out.println("\nAkhir dari program");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
