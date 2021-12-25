/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        long waktuStart, waktuFinish;
        
        // Membaca Dari File
        FileInputStream byteInput = new FileInputStream("input.txt"); 
        System.out.println(byteInput.available());
        
        
        // MEnghitung Waktu Pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.read());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu = " + (waktuFinish - waktuStart));
        byteInput.close();
        
        
        //Membacaa dari Memori
        FileInputStream byteInput2 = new FileInputStream("input.txt"); 
        BufferedInputStream bufferInput = new BufferedInputStream(byteInput2);
        
        bufferInput.mark(200);
        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferInput.read());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu = " + (waktuFinish - waktuStart));
        
        //reset
//        bufferInput.reset();
//        byte[] data = bufferInput.read();
//        String dataString = new String(data);
//        System.out.println(dataString);
        
//        FileOutputStream byteOutput = new FileOutputStream("output.txt");
//        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);
//        
//        bufferedOutput.write(data, 0 , data.length);
//        bufferedOutput.flush();
    }
    
}
