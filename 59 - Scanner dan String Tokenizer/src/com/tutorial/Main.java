/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        System.out.println("hallo world");
//        
//        Scanner inputUser = new Scanner(System.in);
//        
//        System.out.print("Masukan string = ");
//        String input = inputUser.next();
//        
//        System.out.println("Habib orang yang "  + input);
//        
//        input = inputUser.next();
//        System.out.println("Kata kadua = " + input);

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferReader = new BufferedReader(fileInput);
        
//        System.out.println((char)bufferReader.read());

        //Cek kata selanjutanya aada atau tidak.
        Scanner scanner = new Scanner(bufferReader); // true = ada
        //Untuk membaca kata dengan delimeter spasi = enter
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext()); // false = tidak ada.
        
        
        //Membaca kata dengan menggunakan delimater koma
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferReader = new BufferedReader(fileInput2);
        bufferReader.mark(200);
        bufferReader.reset();
        
        scanner = new Scanner(bufferReader);
        scanner.useDelimiter(",");
        System.out.println(scanner.hasNext());
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        
        //Tokenizer
        bufferReader.reset();
        String data = bufferReader.readLine();
        System.out.println(data);
        
        StringTokenizer stringToken = new StringTokenizer(data,",");
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
        // Baris kedua
        bufferReader.reset();
        data = bufferReader.readLine();
        System.out.println(data);
        
        stringToken = new StringTokenizer(data,",");
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
        
        
    }
    
}
