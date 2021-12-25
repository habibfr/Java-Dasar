/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Formatter;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama = "Udin";
        int umur = 20;
        
        // Output Nama saya udin, umur saya adalah 20
        System.out.println("Nama saya adalah " + nama + ",umur saya adalah " + umur );
        
        // Caara lain dengan format String
        // conversion f = float point , d = integer, c = character, s = string, b =  boolean
        System.out.printf("Nama saya adalah %s,umur saya adalah %d",nama,umur);
        
        //Struktur format [Argumen_index$] [flags] [width] [.precision]conversion 
        
         System.out.println("\n\n1. [ ARGUMEN INDEXS ]");
        // output : Udin, wahai Udin, kemana saja kamu Udin?
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?",nama);
        System.out.printf("\nUmur berapa %1$s? \n%1$s menjawab umur saya %2$d tahun \nWah masih muda ya umurnya %2$d tahun",nama,umur);
        
         System.out.println("\n\n2. [ FLAGS ]");
         int int1 = 5;
         int int2 = 8;
         int hasil = int1 - int2;
         System.out.printf("%d - %d = %+d",int1,int2,hasil);
        
        System.out.println("\n\n2. [ WIDTH ]");
        int int3 = 1000;
        System.out.printf("%d",int3);
        System.out.printf("\n%+d",int3); 
        System.out.printf("\n%+10d",int3); // tanda '+' artiny rata kanan dengan spasi di depan
        System.out.printf("\n%-7d",int3); // tanda '-' artinya rata kiri
        System.out.printf("\n%+-10d",int3); // tanda flags '-' dan '+' dapat digabungkan
        System.out.printf("\n% 10d",int3); // flags dapat digunakan heading contoh spasi
        System.out.printf("\n%010d",int3); // heading dengan tanda nol '0'
        System.out.printf("\n%+010d",int3); // heading dengan tanda nol '0' dapat juga diberi tanda plus '+'
        System.out.printf("\n%,10d",int3); // tanda falags koma ',' dapat digunakan untuk memsisahkan angka tiap ribuan
        int int4 = 1000000000;
        System.out.printf("\n%,15d",int4); //
        
        float float1 = 1.343f;
        System.out.printf("\n%f",float1); // float selalu menampilkan 6 desimal dibelakang koma
        System.out.printf("\n%+15f",float1); // tapi float dapat ditambah width nya dengan flags
        System.out.printf("\n%-15f",float1); // tanda '-' (rata kiri juga dapat digunakan)
        
        
        System.out.println("\n\n2. [ .PRECISION ]");
        float float2 = 15.265f;
        System.out.printf("%f",float2);
        System.out.printf("\n%.1f",float2); // [ .1 ] artinya angka setelah koma hanya 1 pembulatan biasa
        System.out.printf("\n%.2f",float2); // [ .2 ] artinya angka setelah koma hanya 2 pembulatan biasa
        System.out.printf("\n%0+10.3f\n",float2); // dapat digabung dengan flags dan width
        
        
        String nama1 = "Ucup";
        float IPK = 3.5344325f;
        System.out.printf("\nBerapa IPK %1$s? \n%1$s = %2$+5.2f\n",nama1,IPK);
        
        String info_biasa = "Nama " + nama1 + ",IPK = " + IPK;
        System.out.println("String Biasa = " + info_biasa);
        
        String info_format = String.format("Nama %s,IPK = %+5.2f",nama1,IPK);
        System.out.println("String format = " + info_format);
        
        
        StringBuilder info_builder = new StringBuilder();
        Formatter formatBuilder = new Formatter(info_builder);
        
        formatBuilder.format("Nama %s,IPK = %+5.2f",nama1,IPK);
        System.out.println("String Builder = " + info_builder);
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println();
        
        
        

    }
    
}
