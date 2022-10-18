package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Worldssdddd");
         
       

        while(true){
            var scanner = new Scanner(System.in);
            System.out.print("Masukan Angka Anda : ");
            int a = scanner.nextInt();
    
            if(a %2 == 0){
                System.out.println("bilangan genap");
            }else{
                System.out.println("bilangan ganjil");
            }
        }

 
    }
}
