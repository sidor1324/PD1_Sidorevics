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
    public FileInputClass(User user){
        saveMark(user);
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
    
    public void saveMark(User user){
        try {  
            BufferedWriter wr = new  BufferedWriter(new FileWriter("UserDBMark.txt"));
            wr.write(user.getName()+" :Mark: "+user.getMark());
            wr.close();            
        }catch (IOException ex) 
        {}       
    }

    
}
