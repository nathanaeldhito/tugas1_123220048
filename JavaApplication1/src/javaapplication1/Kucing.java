/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Loq Gaming
 */
public class Kucing extends Hewan {
      
    public Kucing (String nama) {
        super(nama);
    }
   @Override
    public void sound() {
        System.out.println("meoww!");
    }
}
