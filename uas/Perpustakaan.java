/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;

public class Perpustakaan {
    private List<Anggota> daftarAnggota = new ArrayList<>();
    private List<Peminjaman> daftarPeminjaman = new ArrayList<>();
    public void tambahAnggota(Anggota a) { daftarAnggota.add(a); }
    public void catatPeminjaman(Peminjaman p) { daftarPeminjaman.add(p); }
    public void simpanData(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(daftarPeminjaman);
            System.out.println("Sistem: Data berhasil disimpan ke " + fileName);
        } catch (IOException e) {
            System.err.println("Error saat menyimpan: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    public void muatData(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            daftarPeminjaman = (List<Peminjaman>) ois.readObject();
            System.out.println("Sistem: Data berhasil dimuat!");
        } catch (FileNotFoundException e) {
            System.out.println("Sistem: File tidak ditemukan, memulai dengan data kosong.");
        } catch (Exception e) {
            System.err.println("Error saat memuat data: " + e.getMessage());
        }
    }
    public void tampilkanLaporan() {
        System.out.println("\n=== LAPORAN TRANSAKSI PERPUSTAKAAN ===");
        if (daftarPeminjaman.isEmpty()) System.out.println("Tidak ada data.");
        for (Peminjaman p : daftarPeminjaman) {
            p.tampilkanTransaksi();
            System.out.println("------------------------");
        }
    }
}
