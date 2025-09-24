/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            hewan kucing = new hewan("suti", 5);
            kucing.suara();
            kucing.info();
            
            hewan anjing = new hewan("jiji", 1);
            anjing.suara();
            anjing.info();
    } 
}

