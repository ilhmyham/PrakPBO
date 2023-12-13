/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul12;

/**
 *
 * @author iam
 */
import javax.swing.*;
import java.awt.*;
public class Tugas1 extends javax.swing.JFrame{
    
    public Tugas1(){
        super("Modul PBO Jelas Dan Mudah");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        setLayout(new FlowLayout());
        JLabel j1 = new JLabel("Modul PBO Jelas Dan Mudah");
        JPanel jp = new JPanel();
        jp.add(j1);
        this.add(jp);
        
        String txt[]= {"sangat setuju", "setuju", "Kurang Setuju", "tidak setuju", "sangat tidak setuju"  };
        JComboBox jc = new JComboBox(txt);
        this.add(jc);
        this.pack();
    }
    public static void main(String[] args) {
       new Tugas1();
    }
}
