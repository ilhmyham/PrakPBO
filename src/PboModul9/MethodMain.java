/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul9;

/**
 *
 * @author iam
 */
public class MethodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        System.out.println("Keliling Persegi : " + psg.getKeliling());
        System.out.println("Luas Persegi : " + psg.getLuas()+"\n");
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang : " + pp.getKeliling());
        System.out.println("Luas Persegi Panjang : " + pp.getLuas()+"\n");
        
        JajarGenjang jg = new JajarGenjang();
        System.out.println("Keliling JajarGenjang : " + jg.getKeliling());
        System.out.println("Luas JajarGenjang : " + jg.getLuas()+"\n");
        
        lingkaran lg = new lingkaran();
        System.out.println("Keliling Lingkaran : " + lg.getKeliling());
        System.out.println("Luas Lingkaran : " + lg.getLuas()+"\n");
        
        Segitiga sg = new Segitiga();
        System.out.println("Keliling Segitiga : " + sg.getKeliling());
        System.out.println("Luas Segitiga : " + sg.getLuas()+"\n");
        
    }
    
}
