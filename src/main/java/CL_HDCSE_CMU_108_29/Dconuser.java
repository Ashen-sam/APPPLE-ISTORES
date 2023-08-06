/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CL_HDCSE_CMU_108_29;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashen Samarasekera
 */
public class Dconuser extends UserData {
    private static final String FILEPATH ="C:\\Users\\Ashen\\OneDrive\\Desktop\\asd\\user.txt";
    
    FileWriter file = null;
    BufferedWriter files = null;
    
    void useradd(UserData u1)throws IOException  {
        
    
   
        try{
        PrintWriter out = null;
        String user =u1.getName()+" "+ u1.getEmail()+" "+u1.getTel1()+" "+u1.Address();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(user);
        
        out.close();
            JOptionPane.showMessageDialog(null, "Product added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(Dconuser.class.getName()).log(Level.SEVERE,null,ex);}
    }

    @Override
    void useradd() {
    }

}
