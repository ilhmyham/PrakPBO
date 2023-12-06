/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class Hewan {
    String nama, makanan, type;
    int kaki;
    
    void beriNama(String beriNama){
        nama = beriNama;
    }
    void beriMakanan(String beriMakanan){
        makanan = beriMakanan;
    }
    void berType(String berType){
        type = berType;
    }
    void berKaki(int berKaki){
        kaki = berKaki;
    }
    void infoHewan(){
        System.out.println("Nama Hewan : "+ nama + "\n" +
                "Jumlah Kaki : "+ kaki + "\n" +
                "Makanan : "+ makanan + "\n" +
                "Type Hewan : "+ type
                );
    }
}
