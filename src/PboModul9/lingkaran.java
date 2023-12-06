/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul9;

/**
 *
 * @author iam
 */
public class lingkaran extends MethodAbs{
    int phi = 22/7;
    int r = 7;
    
    public int luas(){
        return phi * r * r;
    }
    
    public int keliling(){
        return 2 * phi * r;
    }
}
