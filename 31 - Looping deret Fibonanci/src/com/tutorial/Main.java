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
//        int fn,fn1,fn2, n;
//        Scanner userInput = new Scanner(System.in);
//        
//        System.out.print("masukan nilai fibonacci ke -");
//        n = userInput.nextInt();
        
        
//        fn2 = 0;
//        fn1 = 1;
//        fn = 1;
        
//        
//        for(int i = 1; i<=n; i++) {
//            System.out.println("nilai fibonnaci ke-" + i + " = " + fn);
//            
//            fn = fn1+fn2;
//            fn2=fn1;
//            fn1 = fn;
//            
//        }
        

//        int fn,fn1,fn2, n,a;
//        Scanner userInput = new Scanner(System.in);
//        
//        System.out.print("masukan nilai fibonacci ke -");
//        n = userInput.nextInt();
//
//        fn2 = 0;
//        fn1 = 1;
//        fn = 1;
//        a = 1;
//        while(a <= n) {
//            System.out.println("nilai fibonacci ke-" + a + " = " + fn);
//            fn = fn1+fn2;
//          fn2 = fn1;
//          fn1 = fn;
//          a++;                  
//        }
        
            int fn,fn1,fn2,a,total,n;
            Scanner userInput = new Scanner(System.in);
            
            System.out.print("masukan nilai fibonaci ke -");
            n = userInput.nextInt();
            
            a = 1;
            fn1 = 1;
            fn2 = 0;
            fn = 1;
 
            
            
            do {
                System.out.println("nilai fibonaci ke-" + a + " = " + fn);
                fn =  fn1 + fn2;
                fn2 = fn1;
                fn1 = fn;
                a++;
                
                
            } while (a <= n);





        
        
        
        // TODO code application logic here
    }
    
}
