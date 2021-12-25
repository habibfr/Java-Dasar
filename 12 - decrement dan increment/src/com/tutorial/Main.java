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
        
        int angka = 7;
        System.out.println("ini unery minus = " + -angka);
        System.out.printf("ini unery tambah = %d \n",angka);
        
        
        int angka2 = 26;
        angka2++;
        int angka3 = 34;
        angka3--;
        
        System.out.println("ini increment '++' " + angka2 );
        System.out.println("ini decrement '--' " + angka3 );
        
        
        int a = 45;
        System.out.printf("nilai sufix %d \n", ++a);
        int b = 5;
        System.out.printf("nilai postfix %d kemudian jadi ", b++);
        System.out.println(b);
        
//        booelan negasi !

        boolean u = true;
        System.out.println("nilai dari u = " + u );
        System.out.println("tapi negasi nilai dari u = " + !u );
        System.out.println(" \n");
         
        System.out.println("====Habib Fatkhul Rohman 070921=====");
         
         
        
        // TODO code application logic here
    }
    
}
