/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
public class Pet {
    private String nama;
    
    public void beriNama(String nama){
        this.nama = nama;
    }
    
    public String panggilNama(){
        return nama;
    }
    
    public String perilaku(){
        return "Hewan Penurut";
    }
}
