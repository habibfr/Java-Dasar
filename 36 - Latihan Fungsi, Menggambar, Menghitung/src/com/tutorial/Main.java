/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Scanner;
/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("masukan panjang = ");
        int panjang = inputUser.nextInt();
        System.out.print("masukan lebar = ");
        int lebar = inputUser.nextInt();
        
        gambar(panjang,lebar);
        
        System.out.println("Luas = " + luas(panjang, lebar));
        
//        int keliling = (panjang + lebar)*2;
        System.out.println("Keliling = " + keliling(panjang, lebar));
        

    }
    private static int keliling(int panjang, int lebar) {
        int hasil = (panjang+lebar)*2;
        return hasil;
    }
    
    
    
    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }
    
    
    
    public static void gambar(int panjang, int lebar) {
        for(int i = 0; i < lebar; i++) {
            for(int j = 0; j < panjang; j++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}
