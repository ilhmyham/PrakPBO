/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class rotiDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roti roti = new Roti();
        Roti Semir = new Roti();
        Roti Brownies = new Roti();
        Roti wonder = new Roti();
        
        roti.beriWarna("hitam");
        roti.beriRasa("pahit");
        roti.timbangRoti(90);
        roti.beriHarga(20.000);
        roti.infoRoti();
        System.out.println("\n");
        
        Semir.beriWarna("merah");
        Semir.beriRasa("asam");
        Semir.timbangRoti(120);
        Semir.beriHarga(40.000);
        Semir.infoRoti();
        System.out.println("\n");
        
        Brownies.beriWarna("putih");
        Brownies.beriRasa("manis");
        Brownies.timbangRoti(100);
        Brownies.beriHarga(50.000);
        Brownies.infoRoti();
        System.out.println("\n");
        
        wonder.beriWarna("putih");
        wonder.beriRasa("manis");
        wonder.timbangRoti(100);
        wonder.beriHarga(50.000);
        roti.infoRoti();   
    }
}
