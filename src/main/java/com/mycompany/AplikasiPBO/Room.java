package com.mycompany.pebeo;



public class Room {
    private int ID;
   private String namaPelatihan;
   //private int jumlahUser;
   private int kuota;
   //private User[] userPelatihan = new User[kuota];

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }
   //public void addUserPelatihan(User newUser){
    //    userPelatihan[jumlahUser] = newUser;
    //    jumlahUser++;
    //}
    public String getNamaPelatihan() {
        return namaPelatihan;
    }
    public void setNamaPelatihan(String namaPelatihan) {
        this.namaPelatihan = namaPelatihan;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
