/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author User
 */
import praktikum4.pekerja;

public class main_tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pekerja Pekerja = new pekerja ("gani", 21, "CEO", 20000000);

        System.out.println("Informasi Awal:");
        System.out.println(Pekerja);
        System.out.println();

        System.out.println("Informasi Nama, Gaji berubah");
        Pekerja.setNama("Gani putra");
        Pekerja.setGaji(30000000);
 
        System.out.println("Setelah Perubahan:");
        System.out.println(Pekerja);
        System.out.println();
    }
}
