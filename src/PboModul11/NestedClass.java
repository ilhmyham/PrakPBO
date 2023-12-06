/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul11;

/**
 *
 * @author iam
 */
public class NestedClass {
    String nama="Ilham Akbar Yudistira"; //lengkapi dengan nama saudara
    String nim="L200220039"; //lengkapi dengan nimsaudara

    public void printNama(){
        System.out.println(nama+" : "+nim);
    }

    static class StaticNestedClass {
        static String jurusan="Teknik Informatika";
    }

    class InnerClass{
        StaticNestedClass snc = new StaticNestedClass();
        private void print(){
            System.out.println(nama+" : "+nim+" : "+snc.jurusan);
        }
    }
    
    public void display(){
        InnerClass inner = new InnerClass();
        inner.print();
    }
}
