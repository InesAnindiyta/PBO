/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class praktikumPBO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kendaraan mobil = new kendaraan("Toyota", "Avanza", 2020);
        
        System.out.println("merek: " + mobil.getMerek());
        System.out.println("model: " + mobil.getModel());
        System.out.println("tahun: " + mobil.getTahun());
        
        mobil.setModel("Innova");
        mobil.setTahun(2021);
        
        System.out.println("model baru: " + mobil.getModel());
        System.out.println("tahun baru: " + mobil.getTahun());
    }
}
