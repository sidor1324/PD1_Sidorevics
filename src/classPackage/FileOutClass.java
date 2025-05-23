/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Artjoms Sidorevics
 */
public class FileOutClass {
    public FileOutClass(){
        readFromFile();
    }
    private void readFromFile(){
        String strLine;
        try {
            FileInputStream fstream = new FileInputStream("UserDB.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader fileout = new BufferedReader(new InputStreamReader(in));
            while ((strLine = fileout.readLine()) != null)   
            {               
                String[] dati = strLine.split(" ");
                User.userDB.add(new User(dati[0],dati[1],dati[2]));
            }
        }catch (IOException ex) 
        {}
    }    
}
