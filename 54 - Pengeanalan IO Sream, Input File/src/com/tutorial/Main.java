/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        try{
//            FileInputStream inputFile = new FileInputStream("file.txt");
//        }catch(Exception e){
//            System.err.println(e);
//        }
//            
            
            
        FileInputStream fileInput = new FileInputStream("input.txt");
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        
        
        
        
        
        
        
        
    }
    
}
