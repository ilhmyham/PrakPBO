/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul6;

/**
 *
 * @author iam
 */
public class SegiTigaSamaKaki extends SegiTIga{
    double sisiMiring = 2;
    double tinggi = Math.sqrt(Math.pow(sisiMiring, alas));
    
    public void hitungLuas(){
        luas = (alas * tinggi)/2;
        System.out.println("luas Segitiga : "+luas);
    }
    
    public void hitungKeliling(){
        keliling = tinggi + alas + sisiMiring;
        System.out.println("luas Segitiga Sama Kaki: "+keliling);
    }
     
     
}
