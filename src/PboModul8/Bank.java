/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
public class Bank {
    int bunga;
    int ebit = 10;
//    
//    public Bank(){
//        System.out.println("Selamat Datang di Bank");
//    }
    
    protected void setBunga(int bunga){
        this.bunga = bunga/ebit;
    }
    
    protected int rasioBunga(){
        return bunga;
    }
}
