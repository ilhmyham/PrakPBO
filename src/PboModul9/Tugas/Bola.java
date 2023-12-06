/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public class Bola extends MethodAbstract{
    int r = 14;
    int phi = 22/7;
    
    public int volume(){
        return 4/3*(phi*r*r*r);
    }
    
    public int luasPermukaan(){
        return 2*phi*r*r;
    }
}
