/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Loq Gaming
 */
public class Hewan {
     private String nama;
     
     public Hewan (String nama) {
        this.nama = nama;
    }
     
     public void sound() {
        System.out.println("Animal sound");
    }
     
      public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }
    
    public void getNama(){
        System.out.println("nama: " + this.nama);
    }
}
