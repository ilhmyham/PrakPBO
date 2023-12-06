/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboDemo4;

/**
 *
 * @author iam
 */
public class methodNonVoid {
    String nama = "baki";
    String nim = "12222";
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public static void main(String[] args) {
        methodNonVoid pp = new methodNonVoid();        
        System.out.println(pp.getNama() +" "+ pp.getNim());
    }
}
