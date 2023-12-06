/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
public class DemoOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perentclaz pc = new Perentclaz();
        ChildClaz cc = new ChildClaz();
        
        pc.printOut();
        cc.printOut();
        
        Hewan hw = new Hewan();
        Kucing kc = new Kucing();
        
        hw.jalan();
        
        
//        kc.jalan();
    }
    
}
