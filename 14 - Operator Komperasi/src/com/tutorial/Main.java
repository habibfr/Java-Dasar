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
        
//        OPERATOR KOMPARASI, MENGUBAH MENJADI BOOELAN
        
//           int a, b;
           boolean hasilKomparasi;
           int a = 90;
           int b = 90;
           
           hasilKomparasi = (a==b);
           
           System.out.printf("%d == %d ---> %s \n",a ,b, hasilKomparasi);
           
           int c, d;
           c = 100;
           d = 87;
           boolean hasilKomparasi1 = (c == d);
           
           System.out.printf("%d == %d ---> %s \n", c, d, hasilKomparasi1);
           
           c = 100;
           d = 87;
           hasilKomparasi1 = (c != d);
           
           System.out.printf("%d != %d ---> %s \n", c, d, hasilKomparasi1);
           
           a = 90;
           b = 90;
           
           hasilKomparasi = (a!=b);
           
           System.out.printf("%d != %d ---> %s \n",a ,b, hasilKomparasi);
           
             c = 100;
           d = 87;
           hasilKomparasi1 = (c > d);
           
           System.out.printf("%d > %d ---> %s \n", c, d, hasilKomparasi1);
           
           a = 90;
           b = 90;
           
           hasilKomparasi = (a > b);
           
           System.out.printf("%d > %d ---> %s \n",a ,b, hasilKomparasi);
           
             c = 100;
           d = 87;
           hasilKomparasi1 = (c < d);
           
           System.out.printf("%d < %d ---> %s \n", c, d, hasilKomparasi1);
           
           a = 90;
           b = 90;
           
           hasilKomparasi = (a < b);
           
           System.out.printf("%d < %d ---> %s \n",a ,b, hasilKomparasi);
           
             c = 100;
           d = 87;
           hasilKomparasi1 = (c <= d);
           
           System.out.printf("%d <= %d ---> %s \n", c, d, hasilKomparasi1);
           
           a = 90;
           b = 90;
           
           hasilKomparasi = (a >=b);
           
           System.out.printf("%d >= %d ---> %s \n",a ,b, hasilKomparasi);
           
           
           
           
           
//        int[] array = {0,1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        int index = userInput.nextInt();
//        System.out.printf("Array ke %d, Nilanya adalah %d",index,array[index]);
        
        
        
        
        
        
        System.out.println("\nAkhir dari program");
        



        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
