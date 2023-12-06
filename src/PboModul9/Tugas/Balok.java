/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public class Balok extends MethodAbstract{
    int p = 20;
    int l = 5;
    int t = 10;
    
    public int volume(){
        return p*l*t;
    }
    
    public int luasPermukaan(){
        return (2 * p * l) + (2 * p * t) + (2 * l * t);
    }
}
