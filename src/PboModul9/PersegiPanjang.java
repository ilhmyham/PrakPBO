/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9;

/**
 *
 * @author iam
 */
public class PersegiPanjang extends MethodAbs{
    int panjang = 3;
    int lebar = 3;
    
    public int luas(){
        return panjang * lebar;
    }
    
    public int keliling(){
        return 2 * (panjang + lebar);
    }
}
