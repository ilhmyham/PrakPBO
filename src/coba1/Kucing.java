/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class Kucing {
    String warnaBulu;
    int umur;
    
    void meong(){
        System.out.println("Rawrrrr.....");
    }
    void umur(int jmlUmur){
        umur = jmlUmur;
        System.out.println("umur : "+ umur + "thn");
    }
    
    public static void main(String[] args) {
        Kucing jawa = new Kucing();
        jawa.meong();
        jawa.umur(5);
        jawa.warnaBulu = "Kuning";
        System.out.println(jawa.warnaBulu);
    }
}
