/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas12;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemManajemenBuku {
    private static final String FILE_TXT = "buku.txt";
    private static final String FILE_SER = "buku.ser";
    private static final List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Buku Baru");
                System.out.println("2. Simpan Buku ke File Teks");
                System.out.println("3. Simpan Buku ke File Serial");
                System.out.println("4. Tampilkan Daftar Buku");
                System.out.println("5. Keluar");
                System.out.print("Pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline
                
                switch (pilihan) {
                    case 1:
                        tambahBuku(scanner);
                        break;
                    case 2:
                        simpanKeFileTeks();
                        break;
                    case 3:
                        simpanKeFileSerial();
                        break;
                    case 4:
                        tampilkanDaftarBuku();
                        break;
                    case 5:
                        System.out.println("Keluar dari sistem.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 5);
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(FILE_TXT)) {
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file teks: " + FILE_TXT);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_SER))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek buku berhasil disimpan ke file serial: " + FILE_SER);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
        }
    }

    private static void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        
        // Tampilkan dari file teks
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_TXT))) {
            String line;
            System.out.println("\nDari file teks:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks.");
        }
        
        // Tampilkan dari file serial
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_SER))) {
            List<Buku> bukuList = (List<Buku>) ois.readObject();
            System.out.println("\nDari file serial:");
            for (Buku buku : bukuList) {
                System.out.println(buku);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca file serial.");
        }
    }
}