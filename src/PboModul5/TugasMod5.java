/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul5;

/**
 *
 * @author iam
 */
public class TugasMod5 {
    String namaBarang;
    double hargaBarang;
    int jumlahBarang;
    
    public TugasMod5(){
        System.out.println("Hai Ini adalah Default Constructor\n");
    }
    
    public TugasMod5(String namaBarang, double hargaBarang, int jumlahBarang){
        System.out.println("Hai Ini adalah Parameter Constructor");
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        System.out.println("nama barang : "+ this.namaBarang);
        System.out.println("harga barang : " + this.hargaBarang);
        System.out.println("jumlah barang : " + this.jumlahBarang);
    }
}
