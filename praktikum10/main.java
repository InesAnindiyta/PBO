/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan =  new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5)); 
        // Output: 15
        
        // Objek Pengurangan
        OperasiHitung pengurangan =  new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5)); 
        // Output: 5
    }
}
