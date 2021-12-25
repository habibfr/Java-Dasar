/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Scanner;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] dataArray = {1,2,3,4,5};
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Angka index ke-");
        int indexInput = userInput.nextInt();
        
        // Exception Biasa
        System.out.println("\nException Biasa");
        try{
            System.out.printf("Nilai index ke-%d adalah %d\n",indexInput,dataArray[indexInput]);
        }catch(Exception e){
            System.err.println(e);
        }
        
        // Exception dari Fungsi 
        System.out.println("\nException Fungsi");
        int data = ambilDataDariArray(dataArray,indexInput);
        System.out.printf("Nilai Index ke-%d adalah %d\n",indexInput,data);
        
        //Exception Throws by Method
        System.out.println("\nException Throws by Method");
        int data2 = 0;
        try{
            data2 = ambilData(dataArray,indexInput);
        }catch(Exception e){
            System.err.println(e);
        }
        System.out.printf("Nilai Index ke-%d adalah %d",indexInput,data2);
        
        
        
        
        
        System.out.println("\n\nAkhir dari program");
             
    }
    
    private static int ambilData(int[] dataArray,int index) throws Exception{
        int hasil = dataArray[index];
        return hasil;
    }
    
    private static int ambilDataDariArray(int[] dataArray,int index){
        int hasil = 0;
        try{
           hasil =  dataArray[index];
        }catch(Exception e){
            System.err.println(e);
        }
        return hasil;
    }
    
}
