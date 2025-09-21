/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class sepedamotor extends kendaraan {
    private final String jenisMesin;

    public sepedamotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);
        this.jenisMesin = jenisMesin;
    }
    public void tampilkanInfoSepedaMotor() {
        tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
