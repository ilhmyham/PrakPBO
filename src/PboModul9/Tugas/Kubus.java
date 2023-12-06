/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public class Kubus extends MethodAbstract   {
    int r = 10;
    public int volume(){
        return r^3;
    }
    
    public int luasPermukaan(){
        return 6 * (r^2);
    }
}
