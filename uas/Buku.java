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

public class Buku extends ItemPerpustakaan implements Pinjam {
    private boolean isTersedia = true;
    public Buku(String id, String judul) {
        super(id, judul);
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("[Buku] ID: " + id + ", Judul: " + judul + 
                           " | Status: " + (isTersedia ? "Tersedia" : "Dipinjam"));
    }
    @Override
    public void pinjamItem() { this.isTersedia = false; }
    @Override
    public void kembaliItem() { this.isTersedia = true; }
    public boolean isTersedia() { return isTersedia; }
}
