/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Isuzu", "Panther Miyabi", 1997, "Green");
        Mobil mobil2 = new Mobil("GM", "Chevrolet Camaro", 1969, "Red");

        mobil1.displayInfo();
        mobil2.displayInfo();

        mobil1.startEngine();
        mobil2.startEngine();

        mobil1.setWarna("Green");
        mobil1.displayInfo();
    }
    
}

