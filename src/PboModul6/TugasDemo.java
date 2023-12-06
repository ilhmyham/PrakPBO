/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul6;

/**
 *
 * @author iam
 */
public class TugasDemo {
    public static void main(String[] args) {
        Persegi kotak1 = new Persegi();
        PersegiPanjang kotakPanjang1 = new PersegiPanjang();
        SegiTIga s1 = new SegiTIga();
        SegiTigaSamaKaki s2 = new SegiTigaSamaKaki();
        SegiTigaSamaSisi s3 = new SegiTigaSamaSisi();
        
        kotak1.hitungKeliling();
        kotak1.hitungLuas();
        System.out.println();
        System.out.println("\n");
        kotakPanjang1.hitungKeliling();
        kotakPanjang1.hitungLuas();
        System.out.println("\n");
        s1.hitungKeliling();
        s1.hitungLuas();
        System.out.println("\n");
        s2.hitungKeliling();  
        s2.hitungLuas();
        System.out.println("\n");
        s3.hitungKeliling();
        s3.hitungLuas();
    }
    
}
