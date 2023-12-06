/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboDemo4;

/**
 *
 * @author iam
 */
import PboModul4.*;
public class demoDefultVariabel {
    public static void main(String[] args) {
        DefaultModifier def = new DefaultModifier();
        System.out.println(def.a);
//        System.out.println(def.c);
        //dalam class DefaultModifier yang berbeda package
        //hanya variabel a saja yang bisa diakses karena 
        //diberi access modifier public sedangkan
        //variabel c, dan b tidak bisa karena 
        //tidak diberi modifier/defult modifier
    }
   
}
