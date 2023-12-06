/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba1;

/**
 *
 * @author iam
 */
public class Car {
    int cadence, gear, speed;
    void changeCadence(int changeCadence){
        cadence = changeCadence;
    }
    void changeGear(int changeGear){
        gear = changeGear;
    }
    void speedUp(int speedUp){
        speed = speedUp;
    }
    void printInfo(){
        System.out.println("Cadence : "+ cadence + "\n" + 
                "Gear : "+ gear + "\n" +
                "Speed : "+ speed );
    }
}
