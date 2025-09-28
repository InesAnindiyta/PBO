/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author User
 */
abstract class produk {
    double harga;

    public produk(String nama, double harga) {
        this.harga = harga;
    }

    abstract double hitungDiskon();
}
