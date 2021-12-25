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
        
//        OPERATOR LOGIKA AND, OR, XOR
        
        boolean a, b, c, d;
         a = true;
         b = true;
         c = false;
         d = false;

         System.out.println("=====AND &&======");
         System.out.println("true && true = " + ( a && b));
         System.out.println("true && false = " + ( a && c));
         System.out.println("false && true = " + ( a && d));
         System.out.println("false && false = " + ( c && d));
         
         System.out.println("=====OR ||=====");
         System.out.println("true || true = " + ( a || b));
         System.out.println("true || false = " + ( a || c));
         System.out.println("false || true = " + ( a || d));
         System.out.println("false || false = " + ( c || d));
         
         System.out.println("=====XOR ^=====");
         System.out.println("true ^ true = " + ( a ^ b));
         System.out.println("true ^ false = " + ( a ^ c));
         System.out.println("false ^ true = " + ( a ^ d));
         System.out.println("false ^ false = " + ( c ^ d));

         System.out.println("=====NOT !=====");
         System.out.println("NOT [!] True = " + ( !a ));
         System.out.println("NOT [!] False= " + ( !c ));

              
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
