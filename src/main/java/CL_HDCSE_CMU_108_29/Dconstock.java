/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CL_HDCSE_CMU_108_29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Dconstock {

    private static final String FILEPATH = "C:\\Users\\Ashen\\OneDrive\\Desktop\\asd\\stock.txt";

    FileWriter file = null;
    BufferedWriter files = null;

    public void additemtotextfile2(Stock st) throws IOException {
        try {
            PrintWriter out = null;
            String itemData = st.getCode_stock() + " " + st.getName_stock() + " " + st.getQuan_stock() + " " + st.getModel_stock();

            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH, true)));
            out.println(itemData);

            out.close();
            JOptionPane.showMessageDialog(null, "Stock added successfully");

        } catch (IOException ex) {
            Logger.getLogger(Dconstock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Stock Findsam(String ashen)
            throws IOException {
        Stock st = null;
        try {

            FileInputStream fileInputStream = new FileInputStream(FILEPATH);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;

            while ((readLine = bufferedReader.readLine()) != null) {
                String[] stocksdet = readLine.split(" ");
                if (ashen.equals(stocksdet[0])) {
                    st = new Stock();
                    st.setName_stock(stocksdet[0]);
                    st.setQuan_stock(stocksdet[1]);
                    st.setCode_stock(stocksdet[2]);
                    st.setModel_stock(stocksdet[3]);

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dconstock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }

}
