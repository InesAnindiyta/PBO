/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author User
 */
public class pekerja extends manusia{

    private double gaji;

    public pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
 
    @Override
    public String toString() {
        return super.toString() + ", Gaji: " + this.gaji;
    }
}
