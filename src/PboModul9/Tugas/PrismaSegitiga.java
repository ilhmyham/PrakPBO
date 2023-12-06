/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public class PrismaSegitiga extends MethodAbstract {
    int luasAlas = 20;
    int luasKel = 10;
    int tinggi = 15;
    
    public int volume(){
        return luasAlas*tinggi;
    }
    
    public int luasPermukaan(){
        return (2*luasAlas) + (luasAlas*tinggi);
    }
}
