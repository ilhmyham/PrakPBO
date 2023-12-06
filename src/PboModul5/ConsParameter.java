/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul5;

/**
 *
 * @author iam
 */
public class ConsParameter {
    String nama, nim;
    int semester;
    
    public ConsParameter(String nama, int semester, String nim){
        this.nama = nama;
        this.semester = semester;
        this.nim = nim;
    }
    
    public void info(){
        System.out.println("nama : " + nama + "\n nim : "+nim+ "\nsemester : " + semester);        
    }
}
