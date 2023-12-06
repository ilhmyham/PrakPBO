/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul6;

/**
 *
 * @author iam
 */
public class Programmer extends Pegawai{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lemburPerJam = 50000;
        double gajiPerBulan;
        Pegawai peg = new Pegawai();
        gajiPerBulan = peg.gajiPokok + lemburPerJam;
        System.out.println(gajiPerBulan);
    }
    
}
