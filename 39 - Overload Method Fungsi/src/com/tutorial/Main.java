/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int hasilInt;
        hasilInt = angka(10,18);
        printAngka(hasilInt);
        
        float hasilFloat1;
        hasilFloat1 = angka(12.4f,23);
        printAngka(hasilFloat1);
        
        float hasilFloat2;
        hasilFloat2 = angka(12,34.5f);
        printAngka(hasilFloat2);
        
        printAngka(10);
        printAngka(34.67f);
        printAngka(140);
        printAngka(434.53f);
        printAngka(56.53d);
        printAngka(34.53f);



    }
    private static int angka(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    
    private static float angka(int angkaInt1, float angkaFloat2){
        return angkaInt1 + angkaFloat2;
    }
    
    private static float angka(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    
    private static void printAngka(float angkaFloat){
        System.out.println("Ini angka Float dengan nilai = " + angkaFloat);
    }
    
    private static void printAngka(Double angkaDouble){
        System.out.println("Ini angka Double dengan nilai = " + angkaDouble);
    }
    
    private static void printAngka(int angkaInteger){
        System.out.println("Ini angka Integer dengan nilai = " + angkaInteger);
    }
}
