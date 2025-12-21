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

public class Anggota implements Serializable {
    private String idAnggota;
    private String nama;
    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }
    public String getNama() { return nama; }
}