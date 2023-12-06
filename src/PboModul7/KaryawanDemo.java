/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul7;

/**
 *
 * @author iam
 */
public class KaryawanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan kar1 = new Karyawan();
        kar1.setNama("Andromeda");
        kar1.setGaji(2000000);
        kar1.setUsia(25);
        
        System.out.println(kar1.getNama());
        System.out.println(kar1.getGaji());
        System.out.println(kar1.getUsia());
    }
    
}
