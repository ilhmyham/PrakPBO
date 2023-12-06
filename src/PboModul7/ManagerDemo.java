/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul7;

/**
 *
 * @author iam
 */
public class ManagerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        Manager m4 = new Manager();
        Manager m5 = new Manager();
        
        m1.setGaji(2000000);
        m1.setJamKerja(8);
        m2.setNama("Galactus");
        m3.setUsia(30);
        m4.setGaji(2000000);
        m5.setJamKerja(8.5f);
        
        System.out.println(m1.getGajiMenager());              
        System.out.println(m2.getNama());
        System.out.println(m3.getUsia());
        System.out.println(m4.getGaji());
        System.out.println(m5.jamKerja());
        
        
    }
    
}
