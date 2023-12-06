/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9;

/**
 *
 * @author iam
 */
public class TururanAbs extends AbstrackClass {
    int x;
    
    public TururanAbs(int a, int b, int c){
        super(a, b, c);
        x = a+b+c;
    }
    
    public void printX(){
        System.out.println(x);
    }
}
