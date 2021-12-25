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
        
        int iniInt = 450;
        System.out.println("nilai int = " + iniInt);
        
        long iniLong = iniInt;
        System.out.println("nilai long = " + iniLong);
        
        
        int iniInt2 =200 ;
        System.out.println("nilai Byte = " + iniInt2);
        
        byte iniByte =(byte) iniInt2;
        System.out.println("nilai short = " + iniByte);
        
       
//        PEMBAGIAN BENAR
        
        float a = 23;
        int b = 3;
        
        float c = a/b;
        System.out.printf("%f / %d = %f \n",a,b,c);
        
        int x = 8;
        int y = 3;
        
        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);
        
        // TODO code application logic here
    }
    
}
