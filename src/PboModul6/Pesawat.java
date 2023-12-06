/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul6;

/**
 *
 * @author iam
 */
public class Pesawat extends Kendaraan{
    int jumlahKursi = 60;
    String BahanBakar = "avtur";
    
    public void infoPesawat(){
        System.out.println("Info Pesawat : "+roda+","+BahanBakar+","+jenisKendaraan+","+jumlahKursi);
    }
}
