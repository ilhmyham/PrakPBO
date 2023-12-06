/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul3;

/**
 *
 * @author iam
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    public String getNama(String ambilNama){
        nama = ambilNama;
        return nama;
    }
    
    public int getNip(int ambilNip){
        nip = ambilNip;
        return nip;
    }
    
    public double getGaji(double ambilgaji){
        gaji = ambilgaji;
        return gaji;
    }
    
    void pegawaiInfo(){
        System.out.println(this.nama);
        System.out.println(this.nip);
        System.out.println(this.gaji);
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Pegawai karyawan1 = new Pegawai();
        karyawan1.getNama("budi");
        karyawan1.getNip(112);
        karyawan1.getGaji(1000.000);
        karyawan1.pegawaiInfo();
        
        Pegawai karyawan2 = new Pegawai();
        karyawan2.getNama("Andi");
        karyawan2.getNip(113);
        karyawan2.getGaji(1200.000);
        karyawan2.pegawaiInfo();
        
        Pegawai karyawan3 = new Pegawai();
        karyawan3.getNama("Anggi");
        karyawan3.getNip(114);
        karyawan3.getGaji(1400.000);
        karyawan3.pegawaiInfo();
        
        Pegawai karyawan4 = new Pegawai();
        karyawan4.getNama("Dani");
        karyawan4.getNip(112);
        karyawan4.getGaji(1200.000);
        karyawan4.pegawaiInfo();
        
        Pegawai karyawan5 = new Pegawai();
        karyawan5.getNama("Ani");
        karyawan5.getNip(115);
        karyawan5.getGaji(1500.000);
        karyawan5.pegawaiInfo();
    }
    
}
