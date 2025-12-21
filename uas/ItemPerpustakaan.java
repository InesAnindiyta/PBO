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

public abstract class ItemPerpustakaan implements Serializable {
    protected String id;
    protected String judul;
    public ItemPerpustakaan(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }
    public abstract void tampilkanInfo();
}
