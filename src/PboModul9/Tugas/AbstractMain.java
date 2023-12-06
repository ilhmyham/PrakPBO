/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public class AbstractMain {
    public static void main(String[] args) {
        Balok blk = new Balok();
        System.out.println("Volume Balok : " + blk.volume());
        System.out.println("Luas Permukaan Balok : "+ blk.luasPermukaan() + "\n");
        
        Kubus kbs = new Kubus();
        System.out.println("Volume Kubus : " + kbs.volume());
        System.out.println("Luas Permukaan Kubus : "+ kbs.luasPermukaan()+ "\n");
        
        Bola bl = new Bola();
        System.out.println("Volume Bola : " + bl.volume());
        System.out.println("Luas Permukaan Bola : "+ bl.luasPermukaan()+ "\n");
        
        Kerucut krc = new Kerucut();
        System.out.println("Volume Kerucut : " + krc.volume());
        System.out.println("Luas Permukaan Kerucut : "+ krc.luasPermukaan()+ "\n");
        
        PrismaSegitiga ps = new PrismaSegitiga();
        System.out.println("Volume PrismaSegitiga : " + ps.volume());
        System.out.println("Luas Permukaan PrismaSegitiga : "+ ps.luasPermukaan()+ "\n");
    }
}
