/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public class Kerucut extends MethodAbstract{
    int phi = 22/7;
    int r = 14;
    int s = 10;
    int t = 6;
    
    public int volume(){
        return (phi*r*r*t)/3;
    }
    
    public int luasPermukaan(){
        return phi*r*(r+s);
    }
}
