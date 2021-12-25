/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Utility {
    
    
    
    
    static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay)throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        
        String data = bufferInput.readLine();
        Boolean isExist = false;
        int nomorData = 0;
        if(isDisplay){
            System.out.println("======================================================================================");
            System.out.println("| NO |\tTahun |\tPenulis              |\tPenerbit             |\tJudul                |");
            System.out.println("======================================================================================");
        }
        
        while(data != null){
            // Baca keywords per baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
                        
            // Jika Keywordsnya cocok maka tampilkan
            if(isExist){
                if(isDisplay){
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data,",");
                    stringToken.nextToken();
                    System.out.printf("| %2d ",nomorData);
                    System.out.printf("| %4s   ",stringToken.nextToken());
                    System.out.printf("|\t%-20s ",stringToken.nextToken());
                    System.out.printf("|\t%-20s ",stringToken.nextToken());
                    System.out.printf("|\t%-20s |",stringToken.nextToken());
                    System.out.print("\n");
                }else{
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        
        if(isDisplay){
            System.out.println("======================================================================================");  
        }
        
        return isExist;
        
    }
      
    static long ambilEntryPerTahun(String penulis,String tahun)throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        
        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;
        
        while(data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");
            
            
            penulis = penulis.replaceAll("\\s+","");
            if(penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next()) ){
                entry = dataScanner.nextInt();
            }
            
            data = bufferInput.readLine();
        }
        
        return entry;
    }
    
    protected static String ambilTahun() throws IOException{
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        
        while(!tahunValid){
            try{
                Year.parse(tahunInput);
                tahunValid = true;
            }catch(Exception e){
                tahunValid = false;
                System.err.println("Tahun Tidak Valid [YYYY]!!! ");
                System.out.print("\nMasukan Tahun Buku Lagi : ");
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }
    
    // Pertanyaan Yes or No
    public static boolean getYesOrNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)?");
        String pilihanUser = terminalInput.next();
        
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan Anda Bukan y atau n");
            System.out.print("\n" + message + " (y/n)?");
            pilihanUser = terminalInput.next();
        }
        
        return pilihanUser.equalsIgnoreCase("y");
    }
    // Menghapus Sreen 
    public static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/C","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch(Exception ex){
            System.err.println("Tidak Dapat Clear Screen");
        }
    }


    
}
