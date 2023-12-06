/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class hewanDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.beriNama("Kerbau");
        hewan1.berKaki(4);
        hewan1.beriMakanan("Rumput");
        hewan1.berType("Herbivora");
        hewan1.infoHewan();
        System.out.println("\n");
        Hewan hewan2 = new Hewan();
        hewan2.beriNama("Harimau");
        hewan2.berKaki(4);
        hewan2.beriMakanan("Daging");
        hewan2.berType("Karnivora");
        hewan2.infoHewan();
    }
}
