/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
//import java.util.Date;
public class CostumerData {
    String nama, alamat, pekerjaan;
    double gaji;
    String tanggal_lahir;
    
    public CostumerData(){
        System.out.println("Constructor ini mempunyai overloading");
    }
    
    public CostumerData(String nama,String alamat, String pekerjaan, double gaji, String tanggal_lahir){
        this.nama = nama;
        this.alamat = alamat;        
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
        this.tanggal_lahir = tanggal_lahir;
        info();
    }
    
    void info(){
        System.out.println("----Data Costumer----");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pekerjaan : "+pekerjaan);
        System.out.println("Gaji : "+ gaji + "k Per hari" );
        System.out.println("Tanggal Lahir : "+tanggal_lahir);
    }
    
}
