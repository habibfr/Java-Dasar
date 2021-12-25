/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // Membacaa File Dulu
      FileReader fileInput = new FileReader("input.txt");
      BufferedReader bufferReader = new BufferedReader(fileInput);
      bufferReader.mark(200);
      
      // Membaca File ke dalam String
      String data = bufferReader.readLine();
      System.out.println(data);
        
      // Membaca Kedalam Char
      bufferReader.reset();
      char[] dataChar = new char[25];
      bufferReader.read(dataChar, 0, 25);
      System.out.println(Arrays.toString(dataChar));
      
      // Meriset bacaan
      bufferReader.reset();
      
      // Membaca Baris
      System.out.println(bufferReader.readLine());
      System.out.println(bufferReader.readLine());
      
      // Menulis File 
      FileWriter fileWriter = new FileWriter("output.txt");
      BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
      
      bufferReader.reset();
      
      String baris1 = bufferReader.readLine();
      bufferWriter.write(baris1, 0, baris1.length());
      bufferWriter.flush();
      
      // menambah new line
      bufferWriter.newLine();
      
      String baris2 = bufferReader.readLine();
      bufferWriter.write(baris2, 0, baris2.length());
      bufferWriter.flush();
      
      
      bufferReader.close();
      bufferWriter.close();
      fileInput.close();
      fileWriter.close();
    }
    
}
