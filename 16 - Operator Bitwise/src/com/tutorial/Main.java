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
        
        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;
        
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        
//        SHIFT LEFT
        System.out.println("SHIFT LEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        
        //        SHIFT RIGHT
        System.out.println("SHIFT RIGHT");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        
                //        Bitwise OR
                System.out.println("BITWISE OR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);
        
//        BITWISE AND
        System.out.println("BITWISE AND");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);
        
        //        BITWISE XOR
        System.out.println("BITWISE XOR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("XOR");
        c = (byte) (a^b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);
        
        //OPERATOR NEGASI / NOT 
        System.out.println("BITWISE NOT ~ ");
        a = 24;
        b =(byte)~a;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits, b);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
