/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CL_HDCSE_CMU_108_29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ashen Samarasekera
 */
public class Files {
         
    private static String FILE_PATH ="C:\\Users\\Ashen\\OneDrive\\Desktop\\asd\\ashen.txt";
    File file;
    private String fileName;

    public Files(String fileName) 
    {
        this.fileName = fileName;
        createANewFile();
    }

    public boolean createANewFile() 
    {
        try 
        {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()) 
            {
                System.out.println("File Created: " + file.getName());
                return true;
            }
            
            System.out.println("File Alredy Exisit !");
            return false;
        } 
        
        catch (IOException e)
        {
            System.out.println("Something went wrowng with creating file" + e);
            return false;
        }
    }
    public boolean createANewFile (String record) 
    {
        try {
            file.createNewFile();
            FileWriter newWrite = new FileWriter(file, true);
            BufferedWriter newBuffer = new BufferedWriter(newWrite);

            newBuffer.write(record);
            newBuffer.newLine();
            newBuffer.close();
            newWrite.close();
            return true;
        } 
        catch (IOException e) 
        {
            System.out.println("Something went wrowng with writing file" + e);
            return false;
        }
    }
    public BufferedReader readFile() 
    {
        if (!createANewFile())
        {
            try 
            {
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);
                return buffer;
            } 
            
            catch (IOException e) 
            {
                System.out.println("Something went wrowng with reading file" + e);
            }
        }
        return null;
    }
}
