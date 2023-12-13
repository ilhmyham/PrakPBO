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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author iam
 */
public class Tugas2 extends JFrame implements ActionListener{
    JFrame f;
    JMenuItem red, yellow, green;
    JMenuBar barMenu;
    JMenu wrnMenu;
    
    public Tugas2(){
        f = new JFrame("Tugas 2");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setSize(500, 400);
        
        barMenu = new JMenuBar();
        f.setJMenuBar(barMenu);
        
        wrnMenu = new JMenu("ganti warna");
        wrnMenu.setMnemonic(KeyEvent.VK_R);
        barMenu.add(wrnMenu);
        
        red = new JMenuItem("merah");
        yellow = new JMenuItem("kuning");
        green = new JMenuItem("hijau");
        
        wrnMenu.add(red);
        wrnMenu.add(green);
        wrnMenu.add(yellow);
        
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);                       
        
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == red) {
            f.getContentPane().setBackground(Color.red);
        }else if (e.getSource() == yellow) {
            f.getContentPane().setBackground(Color.yellow);
        }else if (e.getSource() == green) {
            f.getContentPane().setBackground(Color.green);
        }
    }
    
    public static void main(String[] args) {
        new Tugas2();
    }    
}
