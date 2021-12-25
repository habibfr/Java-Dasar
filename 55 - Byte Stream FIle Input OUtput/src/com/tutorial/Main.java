/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
        
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
//        System.out.println("file input bernilai = " + fileInput);
//        
//        fileInput.close();
//        System.out.println("file input bernilai = " + fileInput);
//        
//        fileInput = new FileInputStream("input.txt");
//        System.out.println("file input bernilai = " + fileInput);
//        
//        fileInput = new FileInputStream("input2.txt");
//        System.out.println("file input bernilai = " + fileInput);
        
        // Membuka FILE
        fileInput = new FileInputStream("input.txt");
        
        //Membaca FILe
        int data = fileInput.read();
        while(data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        
        //Menutup FILe
        fileInput.close();
        
        
        // Membuat file OUTPUT
        
        try{
            // Membuka FIle
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output.txt");
            
            //Membaca File
            int buffer = fileInput.read();
            
            // Menulis File
            while(buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
            
            
        }finally{
            if(fileInput != null){
                fileInput.close();
            }
            if(fileOutput != null){
                fileOutput.close();
            }
        }
        
        try(
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output2.txt")
            ){
                //Membaca FILe
                int data2 = in.read();

                while(data2 != -1){
                    out.write((char)data2);
                    data2 = in.read();
            }
        }    
    }  
}
