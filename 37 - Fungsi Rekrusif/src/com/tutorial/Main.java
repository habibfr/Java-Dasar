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
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukan nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);
        
        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah Nilai = " + jumlah);
        
        int hasil = hasilFaktorial(nilai);
        System.out.println("Jumlah Faktorial = " + hasil);
        
        
        
        
    }
    private static int hasilFaktorial(int parameter) {
        System.out.println("faktorial = " + parameter);
        
        if (parameter == 1) {
            return parameter;
        }
        
        return parameter * hasilFaktorial(parameter - 1);
    }
        
    private static int jumlahNilai(int parameter) {
        System.out.println("parameter = " + parameter);
        
        if (parameter == 0) {
            return parameter;
        }
        
        return parameter + jumlahNilai(parameter - 1);
    }
    
    
    
    
    private static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);
        
        
        if (parameter == 0) {
            return;
        }
        
        parameter--;
        
        printNilai(parameter);
        
       
    }
    
    
    
    
}
