/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboUTS;

/**
 *
 * @author iam
 */
public class Printer {
    private String color;
    private int use_month;
    protected double nilaiBarang;
    
    Printer(){
        System.out.println("printer adalah perangkat keras dari komputer");
    }
    
    Printer(double nilaiBarang, int use_month, String color){
        this.nilaiBarang = nilaiBarang-(0.5/100);
        this.use_month = use_month;
        this.color = color;
    }
    
    protected void setColor(String newColor){
        color = newColor;
    }
    
    public String getColor(){
        return color;
    }
    
    protected void setTimeOfUse(int newTime){
        use_month = newTime;
    }
    
    public int getTimeOfUse(){
        return use_month;
    }
    public void info(){
        System.out.println("color : "+color);
        System.out.println("time : "+ use_month);
        System.out.println("nilai : " + nilaiBarang);
    }
}
