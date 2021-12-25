/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author Habib Fatkhul Rohman
 */
public class Operasi {
    
    public static void updateData()throws IOException{        
        // membuat file databse original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);
        
        
        // membuat database sementara
        File tempDb = new File("tempDb.txt");
        FileWriter fileOutput = new FileWriter(tempDb);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        
        // menampilkan data
        System.out.println("= LIST BUKU =");
        tampilkanData();
        
        // memnentukan pilihan user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("No buku yang ingin di Update : ");
        int UpdateNum = terminalInput.nextInt();
//        getYesOrNo("Appkah anda yakin ingin mengupdate data tersebut : ");
        
        // tampilkan data yang ingi di Update
        String data = bufferInput.readLine();
        int entryCounts = 0;
        
        while(data != null){
            entryCounts++;
            
            StringTokenizer st = new StringTokenizer(data,",");
            
            //ketika entryCounts == updateNum
            if(entryCounts == UpdateNum){
               System.out.println("Buku yang ingin diupdate adalah : \n");
               
               
               System.out.println("Referensi     : " + st.nextToken());
               System.out.println("Tahun         : " + st.nextToken());
               System.out.println("Penulis       : " + st.nextToken());
               System.out.println("Penerbit      : " + st.nextToken());
               System.out.println("Judul         : " + st.nextToken());
           
                 // update data  
                 
                 // Mengambil inputan dari user
                 String[] fieldData = {"tahun", "penulis", "penerbit", "judul"};
                 String[] tempData = new String[4]; 
                 
                 // refresh tokenizer
                 st = new StringTokenizer(data,","); 
                 String originalData = st.nextToken();
                 
                 for(int i = 0; i < fieldData.length; i++){
                    boolean isUpdate = Utility.getYesOrNo("Apakah anda ingin mengubah nama " + fieldData[i]);
                    originalData = st.nextToken();

                    if(isUpdate){
                        //input user 
                        if(fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("Masukan Tahun Buku [YYYY] : ");
                            tempData[i] = Utility.ambilTahun();
                        }else{
                            terminalInput = new Scanner(System.in);
                            System.out.print("Masukan " + fieldData[i] + " baru : ");
                            tempData[i] = terminalInput.nextLine();
                        }
                        
                    }else{
                        tempData[i] = originalData;
                        
                    }
                 }
                 
                st = new StringTokenizer(data,","); 
                originalData = st.nextToken();
                 // Tampilkan data baru ke layar
                System.out.println("Data buku yang telah diupdate adalah : \n");
               
                System.out.println("Tahun         : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis       : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit      : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul         : " + st.nextToken() + " --> " + tempData[3]);
                 
                System.out.println(Arrays.toString(tempData));
                
                boolean isUpdate = Utility.getYesOrNo("Apakah Anda yakin ingin mengpdate data tersebut");
                
                if(isUpdate){
                    boolean isExist = Utility.cekBukuDiDatabase(tempData,false);
                    if(isExist){
                        System.err.println("Data buku sudah ada di database, \nSilahkan hapus data tersebut dahulu");
                        bufferOutput.write(data);
                    }else{
                        // foemat data baru didatabase
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];
                        
                        // bikin primary key 
                        long nomorEntry = Utility.ambilEntryPerTahun(penulis,tahun) + 1;
                        String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
                    
                        // masukan data ke database
                        bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
//                        bufferOutput.newLine();
//                        bufferOutput.flush();
//                        System.out.println("Data Berhasil ditambahkan!!!");
                    }
                    
                }else{
                    // Copy data
                    bufferOutput.write(data); 
//                    bufferOutput.newLine();
                }
                
            }else{
                // Copy data
              bufferOutput.write(data); 
//              bufferOutput.newLine();
            }
           bufferOutput.newLine();
           data = bufferInput.readLine();      
        }
        // menuliss data ke file
        bufferOutput.flush();
        // mengapus file database dan rename temp
        bufferOutput.close();
        fileOutput.close();
        bufferInput.close();
        fileInput.close();
//        2. jalanin method:

        System.gc();

//        3. lalu delete filenya:   
        database.delete();
        tempDb.renameTo(database);        
        
    }
    
    public static void deleteData()throws IOException{
        // ambil database 0riginal
        
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);
        
        // buat database sementara
           
        File tempDb = new File("tempDb.txt");
        FileWriter fileOutput = new FileWriter(tempDb);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        
        
        
        // tampilkan data 
        System.out.println("=== List BUKU ===");
        tampilkanData();
        
        // input user yang dipilih user untk didelete
        Scanner terminalInput  = new Scanner(System.in);
        System.out.print("Masukan nomor buku yang akan dihapus : ");
        int deleteNum = terminalInput.nextInt();
        
        // looping data untuk data yang dihapus
        int entryCounts = 0;
        boolean isFound = false;
        String data = bufferInput.readLine();
        
        while(data != null){
            entryCounts++;
            boolean isDelete = false;
            
            StringTokenizer st = new StringTokenizer(data,",");
            // Tampilkan data yang akan dihapus
            if(deleteNum == entryCounts){
                System.out.println("\nData yang anda ingin hapus adalah : ");
                System.out.println("Referensi  : " + st.nextToken());
                System.out.println("Tahun      : " + st.nextToken());
                System.out.println("Penulis    : " + st.nextToken());
                System.out.println("Peenerbit  : " + st.nextToken());
                System.out.println("Judul      : " + st.nextToken());
                
                isDelete = Utility.getYesOrNo("Apakah anda yakin menghapus data tersebut?");
                isFound = true;
            }   
            
            if(isDelete){
                // skip pindahkan data dari original ke temp
                System.out.println("Data berhasil dihapus");
            }else{
                // pindahkan data dari original ke temp
                bufferOutput.write(data);
                bufferOutput.newLine();
                System.out.println("");
            }
            data = bufferInput.readLine();

        }
        
        
        if(!isFound){
            System.out.println("Buku Tidak Ditemukan!!");
        }

        // menulis data ke temp
        bufferOutput.flush();
        
        // mengapus file database dan rename temp
        bufferOutput.close();
        fileOutput.close();
        bufferInput.close();
        fileInput.close();
//        2. jalanin method:

        System.gc();

//        3. lalu delete filenya:   
        database.delete();
        tempDb.renameTo(database);

    }
    
    public static void tampilkanData()throws IOException{
        
        FileReader fileInput;
        BufferedReader bufferInput = null;

        try{
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch(NullPointerException e){
            System.err.println("Database Tidak Ditemukan");
            System.err.println("Silahkan Menambah Data Terlebih Dahulu!\n");
            tambahData();
        }
                
            System.out.println("======================================================================================");
            System.out.println("| NO |\tTahun |\tPenulis              |\tPenerbit             |\tJudul                |");
            System.out.println("======================================================================================");
            
            int nomorData = 0;
            String data;
            data = bufferInput.readLine();
            while(data != null){
//                if(isDisplay){
//                    
//                }
                nomorData++;
                StringTokenizer stringToken = new StringTokenizer(data,",");
                stringToken.nextToken();
                System.out.printf("| %2d ",nomorData);
                System.out.printf("| %4s   ",stringToken.nextToken());
                System.out.printf("|\t%-20s ",stringToken.nextToken());
                System.out.printf("|\t%-20s ",stringToken.nextToken());
                System.out.printf("|\t%-20s |",stringToken.nextToken());
                System.out.print("\n");
            
                data = bufferInput.readLine();
            }
            System.out.println("======================================================================================");
    }
    
    public static void cariData()throws IOException {
        // Membaca database ada atau tidak
        
        try{
            File file = new File("database.txt");
        }catch(NullPointerException e){
            System.err.println("Database Tidak Ditemukan");
            System.err.println("Silahkan Menambah Data Terlebih Dahulu!\n");
            tambahData();
        }
        
        // Kita ambil keyword dari user
        
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku : ");
        String cariString = terminalInput.nextLine();        
        String[] keywords = cariString.split("\\s+");
        
        // Kita cek keyword di database
        
        Utility.cekBukuDiDatabase(keywords,true);
    }
    
    public static void tambahData()throws IOException{
        // Mengambil Data Di Database
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        
        Scanner terminalInput  = new Scanner(System.in);
        String penulis, judul, tahun, penerbit;
        
        System.out.print("Masukan Nama Penulis Buku : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan Judul Buku : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan Penerbit Buku : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan Tahun Buku [YYYY] : ");
        tahun = Utility.ambilTahun();
        
        
        
        // Mengecek Inputan User Di DataBase
        String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul};
        System.out.println(Arrays.toString(keywords));
        
        boolean isExist = Utility.cekBukuDiDatabase(keywords,false);
        
        // Menulis Buku di Database
        
        if(!isExist){
            System.out.println(Utility.ambilEntryPerTahun(penulis,tahun));
            long nomorEntry = Utility.ambilEntryPerTahun(penulis,tahun) + 1;
            
            String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang anda masukan adalah : ");
            System.out.println("----------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Penerbit     : " + penerbit);
            System.out.println("Judul        : " + judul);
            
            boolean isTambah = Utility.getYesOrNo("Apakah anda ingin menambah data tersebut? ");
               if(isTambah){
                   bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                   bufferOutput.newLine();
                   bufferOutput.flush();
                   System.out.println("Data Berhasil ditambahkan!!!");
               }
        }else{
            System.err.println("Buku yang anda masukan sudah tersedia,dengan data sebagai berikut!!");
            Utility.cekBukuDiDatabase(keywords,true);
        }
        
        bufferOutput.close();
        
    }
  
}
