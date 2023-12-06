/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul11;

/**
 *
 * @author iam
 */
public class OuterClass {
    int num;
    
    private class InnerClass{
        private void print(){
            System.out.println("ini merupakan method inner class");
            
        }
    }
    
    void displayInner(){
        InnerClass ic = new InnerClass();
        ic.print();
    }
}
