/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul10;

/**
 *
 * @author iam
 */
public class Lampu implements ActivityLampu{
    public int statusLampu;    
    
    @Override
    public void matikanLampu(){
        if(statusLampu == 0){
            System.out.println("Lampu dalam kondisi mati");
        }else if (statusLampu == 1){
            statusLampu =- 1;
            System.out.println("Lampu sudah dimatikan");
        }
    }
    
    @Override
    public void hidupkanLampu() {
        if(statusLampu==1){
            System.out.println("Lampu sudahdinyalakan\n***");
        }else {
            statusLampu=+1;
            System.out.println("Lamu sudah dalam kondisi menyala");
        }
    }
    
    @Override
    public void lampuRedup(){
        if(statusLampu == 2){
            System.out.println("Lampu Menyala redup \n***");
        }else if(statusLampu == 1){
            statusLampu =- 1;
            System.out.println("Lampu sudah dimatkan");
        }
    }
    
    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
