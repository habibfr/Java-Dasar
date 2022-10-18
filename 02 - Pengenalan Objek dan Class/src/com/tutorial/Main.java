package com.tutorial;

// Membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    int umur;
    String jurusan;
    double IPK;
}

class Main{
    public static void main(String[] args) throws Exception {

        // membuat objek/instansiasi
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "21410100090";
        mahasiswa1.IPK = 34.5;
        mahasiswa1.jurusan = "Sistem Informasi";
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa1.nama = "\nBudi";
        mahasiswa1.NIM = "21410100060";
        mahasiswa1.IPK = 30.5;
        mahasiswa1.jurusan = "Sistem Informasi";
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);





    }
}
