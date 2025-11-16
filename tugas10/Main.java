/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas10;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Pembayaran produkElektronik = new Elektronik();
        Pembayaran produkMakanan = new Makanan();
        
        // Harga produk
        double hargaElektronik = 1000.0; // Contoh harga untuk Elektronik
        double hargaMakanan = 200.0; // Contoh harga untuk Makanan

        // Menghitung dan menampilkan pajak
        System.out.println("Pajak untuk Elektronik: " + produkElektronik.hitungPajak(hargaElektronik)); // Output: 100.0
        System.out.println("Pajak untuk Makanan: " + produkMakanan.hitungPajak(hargaMakanan)); // Output: 10.0
    }
}
