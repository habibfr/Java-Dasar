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
        int x, y, o;
        
        x = 10;
        o = 8;
        y = hitung(x,o);
        System.out.println("x = " + x + ", o = " + o + ", y = " + y);
        
        x = 6;
        o = 8;
        y = hitung(x,o);
        System.out.println("x = " + x + ", o = " + o + ", y = " + y);

        
        x = 20;
        o = 5;
        y = hitung(x,o);
        System.out.println("x = " + x + ", o = " + o + ", y = " + y);

        
        x = 18;
        o = 6;
        y = hitung(x,o);
        System.out.println("x = " + x + ", o = " + o + ", y = " + y);
        
        
        
        
        
        
        
        
    }
   public static int hitung (int x, int o) {
       int hasil;
       int d,a;
       hasil = x * o ;
       
       return hasil;
    }
    
}
