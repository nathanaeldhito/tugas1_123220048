/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Loq Gaming
 */
public class Polymorphism {
    public static void main(String[] args) {
        Hewan anjing = new Anjing("Buddy");
        Hewan kucing = new Kucing("puss");
        Hewan ayam = new Ayam("rooster");

        // Polymorphism
        makeSound(anjing);
        makeSound(kucing);
        makeSound(ayam);
        anjing.getNama();
        anjing.setName("dito");
        anjing.getNama();
    }

    // Polymorphism
    public static void makeSound(Hewan animal) {
        animal.sound();
    }
}

