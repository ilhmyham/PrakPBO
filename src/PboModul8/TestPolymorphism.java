/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
public class TestPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing tom = new Kucing();
        Anjing bull = new Anjing();
        
        tom.beriNama("TOM");
        System.out.println(tom.panggilNama());
        System.out.println(tom.perilaku());
        tom.suaraKucing();
        
        bull.beriNama("BULL");                
        System.out.println(bull.panggilNama());        
        System.out.println(bull.perilaku());                        
        bull.suaraAnjing();
    }
    
}
