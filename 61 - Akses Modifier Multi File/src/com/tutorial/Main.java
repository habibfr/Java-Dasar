/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import kelasterbuka.util.memasak;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ada 4 Metode ==> Public, private, default, dan protected
         */
        
        // metode public dapat diakses
        Lain.methodPublic();
        
        // metode private tidak dapat diakses
//        Lain.methodPrivate(); 
//        
//        //methode default dapat diakses karena package yang sama
        Lain.methodDefault();
//        
//        // metode proteceted dapat diakses karena packge yang sama
        Lain.methodProtected();
        
        memasak.memasakDaging();
//        memasak.memasakDagingPrivate(); ==> tidak Bisa
//        memasak.memasakDagingDefault(); ==> tidak Bisa
//        memasak.memasakDagingProtected(); ==> tidak Bisa

    }
    
}
