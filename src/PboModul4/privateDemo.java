/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul4;
/**
 *
 * @author iam
 */
import PboModul3.*;
public class privateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrivateModifier mod = new PrivateModifier();
        mod.printInfo();
        //mod.nama atau mod.umur /tidak akan bisa diakses karena access
        //modifirer nya private
        String halo = mod.status = "hola";
        System.out.println(halo);               
    }
    
}
