 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul3;

/**
 *
 * @author iam
 */
public class LocalVariable {
//    int usia = 1; // instance Variabel
    int beratBadan; // instance Variabel
    int umur = 20;
    
   public void hitungUsia(){
       int usia = 0;// localvariabel
       int tahunSekarang = 2019;
       int tahunLahir = 1993;
       
       usia = tahunSekarang - tahunLahir;
       
       System.out.println("Usia Saya : " + usia);
   } 

   public void BeratBadan(){
       int beratLahir = 10;       
       beratBadan = beratLahir + (umur / 2);
       System.out.println("Berat badan : " + beratBadan);
   }
   
    public static void main(String[] args) {
        LocalVariable var = new LocalVariable();
        var.hitungUsia();
        var.BeratBadan();
    }
}
