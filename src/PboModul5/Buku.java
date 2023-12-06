/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul5;

/**
 *
 * @author iam
 */
public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanke;
    double hargaJual;
    
    public Buku(){
        System.out.println("asdasdasd");
    }
    
    public Buku(String namaPengarang, String judulBuku){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        System.out.println("Nama Pengarang : " + this.namaPengarang);
        System.out.println("Judul Buku : " + this.judulBuku + "\n");
    }
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanke){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanke = cetakanke;
        
        System.out.println("Nama Pengarang : " + this.namaPengarang);
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("Cetakan Ke : " + this.cetakanke + "\n");
    }
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanke, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanke = cetakanke;
        this.hargaJual = hargaJual;        
        
        System.out.println("Nama Pengarang : " + this.namaPengarang);
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("Cetakan Ke : " + this.cetakanke);
        System.out.println("Harga Jual : " + this.hargaJual + "\n");
    }        
}
