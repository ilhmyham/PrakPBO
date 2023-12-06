/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul4;

/**
 *
 * @author iam
 */
public class LatihanProgram3 {
    public static void main(String[] args) {
        ProtectedModifier aku = new ProtectedModifier();
        aku.printInfo();
        aku.sendMessage();
        
        PublicModifier kali = new PublicModifier();
        kali.kali();
    }
}
