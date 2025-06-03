/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;

/**
 *
 * @author Artjoms Sidorevics
 */
public class FileInputClass {
    public FileInputClass(String name, String login, String password, String repeat,JLabel jLable){
        if(password.equals(repeat)){
            saveToFile(name, login, password);
            jLable.setText("Lietotajs tiek pievienots");
        }
        else
            jLable.setText("Paroles nesakrit");
    }
    public FileInputClass(User user, String testName){
        saveMark(user, testName);
    }
    
    private void saveToFile(String name, String login, String password){
        try {  
            BufferedWriter wr = new  BufferedWriter(new FileWriter("UserDB.txt",true));
            wr.write(name+"/"+login+"/"+password);
            wr.newLine();
            wr.close();            
        }catch (IOException ex) 
        {}
    }    
    
    public void saveMark(User user, String testName){
        try {  
            BufferedWriter wr = new  BufferedWriter(new FileWriter("UserDBMark.txt",true));
            wr.write(user.getName()+" :Mark "+testName+": "+user.getMark());
            wr.close();            
        }catch (IOException ex) 
        {}       
    }

    
}
