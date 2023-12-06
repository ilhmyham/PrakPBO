/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PboModul8;

/**
 *
 * @author iam
 */
import java.util.Date;
public class OverLoadingCosntructor {
    int idUser;
    String username;
    int level;
    Date lastLogin;
    
    public OverLoadingCosntructor(){
        
    }
    
    public OverLoadingCosntructor(int idUser, String username){
        this.idUser = idUser;
        this.username = username;
    }
}
