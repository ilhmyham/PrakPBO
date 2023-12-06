/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul3;

/**
 *
 * @author iam
 */
public class Nilai {
    double nilaiUTS, nilaiUAS, nilaiTugas;
    double nilaitotal = 0;
    
    public void getUTS(double nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }
    
    public void getUAS(double nilaiUAS){
        this.nilaiUAS = nilaiUAS;
    }
    public void getTugas(double nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    public double getTotal(){
       nilaitotal = nilaiUTS  + nilaiUAS + nilaiTugas;
        System.out.println("nilai total : " + nilaitotal);
        return nilaitotal;        
    }
}
