/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class Roti {
    String warna,rasa;
    int berat;
    double harga; 
    
    void beriWarna (String warnaRoti){
        warna = warnaRoti;
    }
    void beriRasa(String rasaRoti){
        rasa = rasaRoti;
    }
    void beriHarga(double hargaRoti){
        harga = hargaRoti;
    }
    void timbangRoti(int beratRoti){
        berat = beratRoti;
    }
    void infoRoti(){
        System.out.println("warna roti: "+ warna + "\n"+
        "rasa roti: "+ rasa + "\n" +
        "berat roti: "+ berat + "g" +"\n"+
        "harga roti: Rp."+ harga
        );
    }
}
