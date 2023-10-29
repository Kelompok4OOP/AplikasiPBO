package com.mycompany.pebeo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Acer
 */
public class User extends Person {
    

    public User(String nama, String password, String username, String umur, String gender) {
        super(nama, password, username, umur, gender);
    }


    // Override metode displayInfo() dari kelas Person
    @Override
    public void displayInfo() {  // Overriding terjadi di sini
        System.out.println("User Info:");
        System.out.println("Nama: " + getNama());
    }
}

