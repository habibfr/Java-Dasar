/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.io.*;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        // Membuka File
        
        // Byte stream --> menggunakan FileInputStream
        // Char Stream --> menggunakan FileReader
        
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader charFileInput = new FileReader("input.txt");
        
        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");
        
        // Membaca File 
        
        // byte 
        System.out.println("Menggunakan Byte Stream");
        int buffer = byteFileInput.read();
        while(buffer != -1){
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }
        
        System.out.println("\n");
        
        // Char
        System.out.println("Menggunakan Char Stream");
        buffer = charFileInput.read();
        while(buffer != -1){
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }
        
        
        // Menutup File
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
        
        
        
    }
    
}
