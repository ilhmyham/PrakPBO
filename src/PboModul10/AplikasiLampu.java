/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul10;

/**
 *
 * @author iam
 */
import java.util.Scanner;
public class AplikasiLampu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampu lampu = new Lampu();        
        Scanner sc = new Scanner(System.in);
        
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status Lampu = "+lampu.statusLampu+"\nketikkan");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu");
        
        if(lampu.setSaklar(sc.nextInt())==0){
            lampu.matikanLampu();
        }else {
            lampu.hidupkanLampu();
        }
    }    
}
