/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
public class DemoBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        BankPribadi bp1 = new BankPribadi();
        BankUmum bu1 = new BankUmum();
        BankPasar bps1 = new BankPasar();
        BankSyariah bs1 = new BankSyariah();
        
        bank1.setBunga(10);
        bp1.setBunga(20);
        bu1.setBunga(30);
        bps1.setBunga(40);
        bs1.setBunga(50);
        
        System.out.println("-----Rasio Bunga-------");
        System.out.println("Bank : " + bank1.rasioBunga());
        System.out.println("Bank Pribadi : "+ bp1.rasioBunga());
        System.out.println("Bank Umum : "+ bu1.rasioBunga());
        System.out.println("Bank Pasar : "+bps1.rasioBunga());
        System.out.println("Bank Syariah : "+bs1.rasioBunga());
    }
    
}
