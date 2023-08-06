/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CL_HDCSE_CMU_108_29;

    
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashen Samarasekera
 */
public class Dconproducts {

private static final String FILEPATH ="C:\\Users\\Ashen\\OneDrive\\Desktop\\asd\\product.txt";
    
    FileWriter file = null;
    BufferedWriter files = null;
    
    public void addproducts (Insert item) throws IOException 
    {
        try{ 
        PrintWriter out = null;
        String itemData =item.getCode_product()+" "+ item.getPrice_product()+" "+item.getName_product()+" "+item.getVersion_product();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(itemData);
        
        out.close();
            JOptionPane.showMessageDialog(null, "Product added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(Dconproducts.class.getName()).log(Level.SEVERE,null,ex);}
    }
    
    public Insert addproducts(String ashen)
            throws IOException {   
        Insert item = null;
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;
            
            while((readLine = bufferedReader.readLine())!=null){
            String[]  productsdet = readLine.split(" ");
              if(ashen.equals(productsdet[0]))
            {
                item = new Insert();
                 item.setCode_product(productsdet[0]);
                   item.setPrice_product(Integer.parseInt(productsdet[1]));
                item.setName_product(productsdet[2]);
               item.setVersion_product(productsdet[3]);
               
               
            }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dconproducts.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return item;
    }

}

    

