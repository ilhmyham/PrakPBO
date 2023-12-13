/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul12;

/**
 *
 * @author iam
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
public class FrameB extends javax.swing.JFrame{
    public FrameB(){
        super("Frame dan Button");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameB fb = new FrameB();
        JPanel panel = new JPanel();
        
        URL img = FrameB.class.getResource("ww.jpg");        
        JButton jbtok = new JButton("ok");
        JButton jbtImg = new JButton(new ImageIcon(img));
        
        panel.add(jbtok);
        panel.add(jbtImg);
        
        fb.add(panel);
        fb.setVisible(true);
    }
}
