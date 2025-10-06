/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {

        // 1. Output Produk
        Produk produk1 = new Elektronik("Laptop", 18000000, 3);
        produk1.tampilkanInfo();

        // 2. Output Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Ines", 8000000, 1000000);
        pegawai1.tampilkanInfo();

        // 3. Output Polimorfisme
        Produk produk2 = new Makanan("Snack ringan", 15000, "2026-10-08");
        Pegawai pegawai2 = new PegawaiKontrak("Siska", 3000000, 12);

        produk2.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
    
}
