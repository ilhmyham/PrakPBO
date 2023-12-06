/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
public class BankUmum extends Bank{
    protected int rasioBunga(){
        return bunga;
    }
    
    public void info(){
        System.out.println("Rasio Bank Umum: " + bunga);
    }
}
