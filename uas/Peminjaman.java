/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author User
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements Serializable {
    private String idTransaksi;
    private List<Buku> daftarBuku; 
    public Peminjaman(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        this.daftarBuku = new ArrayList<>();
    }
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
        b.pinjamItem();
    }
    public void tampilkanTransaksi() {
        System.out.println("ID Transaksi: " + idTransaksi);
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }
    }
}
