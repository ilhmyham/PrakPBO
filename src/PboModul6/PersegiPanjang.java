/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul6;

/**
 *
 * @author iam
 */
public class PersegiPanjang extends BangunDatar{
    int panjang = 6;
    double lebar = 2;
    
    public void hitungLuas(){
        luas = panjang * lebar;
        System.out.println("luas Persegi Panjang : "+luas);
    }
    
    public void hitungKeliling(){
        luas = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : "+luas);
    }
}
