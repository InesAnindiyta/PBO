/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
                buku buku = new buku("Novel", 500000);
        elektronik elektronik = new elektronik("Tv", 8000000);
        pakaian pakaian = new pakaian("Kemeja", 150000);

        KeranjangBelanja keranjang = new KeranjangBelanja(); 
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        System.out.println("Total harga setelah diskon: " + keranjang.totalHargaSetelahDiskon());
    }
    
}
