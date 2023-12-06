/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul11;

/**
 *
 * @author iam
 */
public class OuterDemoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OuterDemo2 outer = new OuterDemo2();

        //Membuat Object InnerDemo
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
    
}
