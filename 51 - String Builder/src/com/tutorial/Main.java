/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import java.lang.StringBuilder;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //  MEMBUAT STRING YANG BERBEDA DENGAN ALAMAT ADDRESS YANG SAMA
        
        StringBuilder builder = new StringBuilder("halo");
        printBuilder(builder);
        
        // apennd
        builder.append(" semuanya");
        printBuilder(builder);
        
        // append 
        builder.append(" warga surabaya tercinta");
        printBuilder(builder);
        
        //insert
        builder.insert(19, " kota");
        printBuilder(builder);
        
        //delete
        builder.delete(18,23);
        printBuilder(builder);
        
        //mengganti character di tengah string builder
        builder.setCharAt(20,'S');
        printBuilder(builder);
        
        //replace
        builder.replace(20, 28, "Medan");
        printBuilder(builder);
        
        //menggantiaddress string builder ke string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        
        int addressKalimat = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressKalimat));
        
        StringBuilder builder2 = new StringBuilder(kalimat);
        printBuilder(builder2);
        
        //append dari String ke StringBuilder
        builder2.append(" di indonesia");
        printBuilder(builder2);
        
        

    }

    private static void printBuilder(StringBuilder dataBuilder){
        System.out.println(dataBuilder);
        System.out.println("panjang = " + dataBuilder.length()); // panjang huruf = 4 kata
        System.out.println("kapsitas = " + dataBuilder.capacity()); // kapsitas 16 + 4 = 20

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
        
    }
}
