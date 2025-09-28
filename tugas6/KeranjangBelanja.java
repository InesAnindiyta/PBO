/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author User
 */
import java.util.ArrayList;

class KeranjangBelanja {
    ArrayList<produk> produkList = new ArrayList<>();

    void tambahProduk(produk produk) {
        produkList.add(produk);
    }

    double totalHargaSetelahDiskon() {
        double total = 0;
        for (produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }  
}
