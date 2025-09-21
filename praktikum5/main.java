/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        kendaraan kendaraan = new kendaraan("Innova", 50);
        kendaraan.tampilkanInfo();

        Mobil mobil = new Mobil("Toyota", 125, 5);
        mobil.tampilkanInfoMobil();

        sepedamotor motor = new sepedamotor("Honda", 125, "Mesin matic");
        motor.tampilkanInfoSepedaMotor();
    }
}
