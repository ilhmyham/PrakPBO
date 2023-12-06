/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul4;

/**
 *
 * @author iam
 */
public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;
    
    public void kali(){
        int d = a*b*c;
        System.out.println("Hasil Kali : " + d);
    }
    
    public void tambah(){
        int d = a + b + c;
        System.out.println("hasil tambah : " + d);
    }
    
    public void kurang(){
        int d = a - b - c;
        System.out.println("hasil Kurang : " + d);
    }
    
    public void bagi(){
        float d = a/b/c;
        System.out.println("hasil bagi : " + d);
    }
    
    public void rata_rata(){
        double d = (a + b + c) / 3;
        System.out.println("hasil rata-rata : "+d);
    }
}
