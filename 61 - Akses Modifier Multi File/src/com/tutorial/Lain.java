/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

//import static com.tutorial.Main.methodDefault;
//import static com.tutorial.Main.methodPublic;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Lain {
            // dapat diakses oleh semua 
    public static void methodPublic(){
        System.out.println("Lain: public");
        methodPrivate();
    }
    
    // hanya dapat diakses oleh main file
    private static void methodPrivate(){
        System.out.println("Lain: private");
    }
    
    // hanya dapat diakses oleh package file
    static void methodDefault(){
        System.out.println("Lain: default");
    }
    
    // hanya dapat diakses oleh package file dan sub kelasnya
    protected static void methodProtected(){
        System.out.println("Lain: protected");
    }
}
