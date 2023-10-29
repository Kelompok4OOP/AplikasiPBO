/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pebeo;

/**
 *
 * @author Acer
 */
public class Pebeo {
    
     public static void main(String[] args) {
        User user = new User("John Doe", "user123","john","18","pria");
        Coach coach = new Coach("Alice Smith", "coach456","alice","20","wanita", "mentor of Gender Organization Yakami");
        Konselor konselor = new Konselor("David Saga", "konselor789","David","15","pria", "Popular Motivator");
        // Menggunakan metode displayInfo() yang telah di-override
        konselor.displayInfo();  // Memanggil displayInfo() yang di-override
        coach.displayInfo();  // Memanggil displayInfo() yang di-override

        // Menggunakan metode overload
        konselor.displayInfo("Physicological Talking Award");  // Memanggil displayInfo() yang di-overload
        coach.displayInfo("Best Mentor Universe");  // Memanggil displayInfo() yang di-overload
    }
}
