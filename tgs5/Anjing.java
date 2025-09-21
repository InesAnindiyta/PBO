/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs5;

/**
 *
 * @author User
 */
public class Anjing extends Hewan{
        public Anjing(String nama, String jenis) {
        super(nama, jenis);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Guk Guk");
    }
}
