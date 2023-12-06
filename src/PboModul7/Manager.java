/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul7;

/**
 *
 * @author iam
 */
public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    
    public float jamKerja(){
        return jamKerja;
    }
    
    public void setJamKerja(float jamKerja){
        this.jamKerja = jamKerja;
    }
    
    public float getGajiMenager(){
        return getGaji() * 2;
    }
}