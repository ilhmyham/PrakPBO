/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9.Tugas;

/**
 *
 * @author iam
 */
public abstract class MethodAbstract {
    public abstract int volume();
    public abstract int luasPermukaan();
    
    public int getVol(){
        return luasPermukaan();
    }
}
