/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul12;

/**
 *
 * @author iam
 */
import java.awt.*;
import javax.swing.*;
public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super("Frame dan Button");
        setSize(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container kontener = fa.getContentPane();
        JButton jbtok = new JButton("ok");
        kontener.add(jbtok);
    }
}
