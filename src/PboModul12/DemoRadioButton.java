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
public class DemoRadioButton {
    public static void main(String[] args) {
        Utama  u = new Utama();
        u.setSize(1000, 100);
        
        JRadioButton[] teams = new JRadioButton[4];
        teams[0] = new JRadioButton("sangat tidak setuju");
        teams[1] = new JRadioButton("tidak setuju");
        teams[2] = new JRadioButton("kurang setuju");
        teams[3] = new JRadioButton("setuju", true);
        teams[3] = new JRadioButton("sangat setuju");
        
        JPanel panel = new JPanel();
        JLabel Pernyataan = new JLabel("modul pemrograman berorientasi objek jelas dan mudah");
        panel.add(Pernyataan);
        
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < teams.length; i++) {
            group.add(teams[i]);
            panel.add(teams[i]);
        }
        
        u.add(panel);
        u.setVisible(true);
    }
}
