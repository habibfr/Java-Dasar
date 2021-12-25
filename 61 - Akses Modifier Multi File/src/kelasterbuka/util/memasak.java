/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasterbuka.util;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class memasak {
    public static void memasakDaging(){
        System.out.println("Kelas Terbuka : Memasak Public");
    }
    private static void memasakDagingPrivate(){
        System.out.println("Kelas Terbuka : Memasak Private");
    }
    static void memasakDagingDefault(){
        System.out.println("Kelas Terbuka : Memasak Default");
    }
    protected void memasakDagingDefaultProtected(){
        System.out.println("Kelas Terbuka : Memasak Default");
    }
}
