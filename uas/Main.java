/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas;

/**
 *
 * @author User
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        
        // Muat data di awal saat aplikasi dibuka
        perpus.muatData("perpus.ser");
        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n=== SISTEM PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Peminjaman Buku");
            System.out.println("3. Lihat Laporan Peminjaman");
            System.out.println("4. Simpan & Keluar");
            System.out.print("Pilih menu (1-4): ");
            try {
                int pilihan = Integer.parseInt(scanner.nextLine());
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan ID Anggota: ");
                        String idA = scanner.nextLine();
                        System.out.print("Masukkan Nama Anggota: ");
                        String namaA = scanner.nextLine();
                        perpus.tambahAnggota(new Anggota(idA, namaA));
                        System.out.println("Anggota berhasil didaftarkan.");
                        break;
                    case 2:
                        System.out.print("Masukkan ID Transaksi: ");
                        String idT = scanner.nextLine();
                        Peminjaman trx = new Peminjaman(idT);
                        
                        System.out.print("Jumlah Buku Yang Dipinjam ");
                        int jml = Integer.parseInt(scanner.nextLine());
                        
                        for (int i = 0; i < jml; i++) {
                            System.out.print("ID Buku ke-" + (i+1) + ": ");
                            String idB = scanner.nextLine();
                            System.out.print("Judul Buku: ");
                            String judulB = scanner.nextLine();
                            
                            Buku b = new Buku(idB, judulB);
                            trx.tambahBuku(b);
                        }
                        perpus.catatPeminjaman(trx);
                        System.out.println("peminjaman berhasil.");
                        break;
                    case 3:
                        perpus.tampilkanLaporan();
                        break;
                    case 4:
                        perpus.simpanData("perpus.ser");
                        System.out.println("Terima kasih!");
                        berjalan = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Kesalahan Input: Harap masukkan angka!");
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
        scanner.close();
    }
}