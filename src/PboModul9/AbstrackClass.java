/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9;

/**
 *
 * @author iam
 */
abstract class AbstrackClass {
    int a;
    int b;
    int c;
    
    public AbstrackClass(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int kali(){
        return a*b*c;
    }
}
