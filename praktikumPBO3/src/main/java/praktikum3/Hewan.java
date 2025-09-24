/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author User
 */
public class Hewan {
    private String nama;
    private int umur;
    
    public hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getName() {
        return nama;
    }
    public void setName(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void suara() {
        System.out.println("hewan bersuara");
    }
    public void info() {
        System.out.println("Nama hewan: " + nama);
        System.out.println("Umur hewan: " + umur);
    }
    public void berlari () {
        System.out.println("hewan sedang berlari");
    }
}

