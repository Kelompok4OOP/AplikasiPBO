package com.mycompany.pebeo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Acer
 */
public class Konselor extends Person {
    private final String pengalamanKerja;

    public Konselor(String nama, String password, String username, String umur, String gender, String pengalamanKerja) {
        super(nama, password, username, umur, gender);
        this.pengalamanKerja = pengalamanKerja;
    }

    public String pengalamanKerja() {
        return pengalamanKerja;
    }

    // Override metode displayInfo() dari kelas Person
    @Override
    public void displayInfo() {  // Overriding terjadi di sini
        System.out.println("Konselor Info:");
        System.out.println("Nama: " + getNama());
        System.out.println("pengalaman kerja: " + pengalamanKerja);
    }

    // Metode overload
    public void displayInfo(String prestasi) {  // Overloading terjadi di sini
        System.out.println("Konselor Info (with prestasi):");
        System.out.println("Nama: " + getNama());
        System.out.println("pengalaman kerja: " + pengalamanKerja);
        System.out.println("prestasi: " + prestasi);
    }
}
