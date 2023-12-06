/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul6;

/**
 *
 * @author iam
 */
public class Persegi extends BangunDatar{
    double sisi = 5;
    
    public void hitungLuas (){
        luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
    }
    public void hitungKeliling(){
        keliling = sisi * 4;
        System.out.println("Keliling Persegi : " + keliling);
    }
}
