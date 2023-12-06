/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul3;

/**
 *
 * @author iam
 */
public class MethodVoid {
    int hour, minute, second;
    
   public void duration(int hour, int minute, int second){
       this.hour = hour;
       this.minute = minute;
       this.second = second;
   }
   
   public void info(){
       System.out.println("Total waktu : "+ hour + ":" + minute + ":" + second);
   }
   
    public static void main(String[] args) {
        MethodVoid vm = new MethodVoid();
        vm.duration(1, 30, 15);
        vm.info();
    }
}
