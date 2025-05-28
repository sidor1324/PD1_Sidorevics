/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.io.BufferedReader;
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
        try{
            BufferedReader fileout = new BufferedReader(new InputStreamReader(new FileInputStream("UserDB.txt")));
            String strLine;
            while ((strLine = fileout.readLine()) != null)   
            {               
                String[] dati = strLine.split("/");
                String name = dati[0];
                String login = dati[1];
                String password = dati[2];
                User.userDB.add(new User(name, login, password));
            }
            fileout.close();           
        }catch (IOException ex) 
        {}
    }    
}
