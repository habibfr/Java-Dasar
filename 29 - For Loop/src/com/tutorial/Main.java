/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=====FOR LOOP PERTAMA=====");
        for(int j = 0;j <= 10; j++) {
            System.out.println("For Loop ke-" + j);
        }
        
        System.out.println("=====FOR LOOP KEDUA=====");
        for(int j = 0;j < 10; j++) {
            System.out.println("For Loop ke-" + j);
        }
        
        System.out.println("=====FOR LOOP KETIGA=====");
        for(int j = 9;j > 6; j--) {
            System.out.println("For Loop ke-" + j);
        }
        
        System.out.println("=====FOR LOOP KEEMPAT=====");
        for(int j = 9;j >= 2; j--) {
            System.out.println("For Loop ke-" + j);
        }
        
        System.err.println("\n\nCOBA COBA");
        
        for (int index = 1; index < 20; index++) {
            if(index % 2 == 0){
                System.err.println("ini indeks ke-" + index + " genap");
            }else{
                System.err.println("ini indeks ke-" + index + " ganjil");
            }
        }
        System.err.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        int beda = 1;
        for (int i = 1; i < 20; i++) {
            System.err.println( "ini i = " + i);
            i = i + beda;
            beda++;            
        }
















        

        // int sum = 0; int i = 0;
        // while(sum < 15){
        //     sum = sum + i;
        //     if(sum!=0){
        //         System.err.println(sum);
        //     }
        //     i++;
        // }


        // System.err.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
