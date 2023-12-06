/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class carDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.changeCadence(50);
        car1.changeGear(2);
        car1.speedUp(20);
        car1.printInfo();
//        System.out.println("\n");
        car2.changeCadence(30);
        car2.changeGear(1);
        car2.speedUp(10);
        car2.printInfo();
    }
    
}
