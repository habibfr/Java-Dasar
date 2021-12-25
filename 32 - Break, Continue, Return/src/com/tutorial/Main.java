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
        
        int a = 0;
        System.out.println("ini awal looping...");
        while (true) {
            a++;
            if (a == 10) {
                break; // dihentikan paksa
            } else if (a == 5) {
                continue; // tidak dilewati/diterobos
            } else if (a == 3) {
                return;
             }
            System.out.println("Ini Looping ke - " + a);
//            return; // ini adaalh pengembalian ke method awal
        }
            System.out.println("Ini Akhir Looping...");
//        return;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
