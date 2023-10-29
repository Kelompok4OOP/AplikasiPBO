package com.mycompany.pebeo;



public class Coach extends Person {
    private final String pengalamanKerja;

    public Coach(String nama, String password, String username, String umur, String gender, String pengalamanKerja) {
        super(nama, password, username, umur, gender);
        this.pengalamanKerja = pengalamanKerja;
    }

    public String pengalamanKerja() {
        return pengalamanKerja;
    }

    // Override metode displayInfo() dari kelas Person
    @Override
    public void displayInfo() {  // Overriding terjadi di sini
        System.out.println("Coach Info:");
        System.out.println("Nama: " + getNama());
        System.out.println("pengalaman kerja: " + pengalamanKerja);
    }

    // Metode overload
    public void displayInfo(String prestasi) {  // Overloading terjadi di sini
        System.out.println("Coach Info (with prestasi):");
        System.out.println("Nama: " + getNama());
        System.out.println("pengalaman kerja: " + pengalamanKerja);
        System.out.println("prestasi: " + prestasi);
    }
}
