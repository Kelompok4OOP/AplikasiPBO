package com.mycompany.pebeo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Acer
 */
public class Person {
    private String nama;
    private String password;
    private String username;
    private String umur;
    private String gender;
    

    public Person(String nama, String password, String username, String umur, String gender) {
        this.nama = nama;
        this.password = password;
        this.username = username;
        this.umur = umur;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    

    // Metode yang akan di-override di subkelas
    public void displayInfo() {
        System.out.println("Nama: " + nama);
    }
}
