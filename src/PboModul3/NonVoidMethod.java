/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul3;

/**
 *
 * @author iam
 */
public class NonVoidMethod {
    String nama;
    String nim;
    
    public String getNama(String ambilNama){
        return nama = ambilNama;
    }
    
    public String getNim(String ambilNim){
        return nim = ambilNim;
    }
    
    public static void main(String[] args) {
        NonVoidMethod Mhs = new NonVoidMethod();
        System.out.println(Mhs.getNama("Ilham"));
        System.out.println(Mhs.getNim("l200220039"));
        
    }
    
}
