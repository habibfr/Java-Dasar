/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

// library java
import java.util.*;
import java.io.IOException;

// library CRUD
import CRUD.Operasi;
import CRUD.Utility;



/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        Boolean isLanjutkan = true;
        
        while(isLanjutkan){
            Utility.clearScreen();
            System.out.println("===== Database Perpustakaan ====\n");
            System.out.println("1.\tMelihat Seluruh Buku");
            System.out.println("2.\tMencari Data Buku");
            System.out.println("3.\tMenambah Data Buku");
            System.out.println("4.\tMengubah Data Buku");
            System.out.println("5.\tMenghapus Data Buku\n");

            System.out.print("Pilihan Anda : ");
            pilihanUser = terminalInput.next();

            switch(pilihanUser){
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    //tampilan data
                    Operasi.tampilkanData();
                    break;
                case "2":
                    System.out.println("\n============");
                    System.out.println("MENCARI BUKU");
                    System.out.println("============");
                    //mencari data
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("\n=============");
                    System.out.println("MENAMBAH BUKU");
                    System.out.println("=============");
                    //menambah data
                    Operasi.tambahData();
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("\n=============");
                    System.out.println("MENGUBAH BUKU");
                    System.out.println("=============");
                    //mengubah/update data
                    Operasi.updateData();
                    break;
                case "5":
                    System.out.println("\n==============");
                    System.out.println("MENGAHPUS BUKU");
                    System.out.println("==============");
                    //menghapus data
                    Operasi.deleteData();
                    break;
                default:
                    System.err.println("Pilihan Anda Tidak Tersedia\nSilahkan Pilih Angka[1-5]");
            }

            isLanjutkan = Utility.getYesOrNo("Apakah anda Ingin Melanjutkan");
        } 
    } 


}


