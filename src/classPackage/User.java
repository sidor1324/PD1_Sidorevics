/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Artjoms Sidorevics
 */
public class User {
    private final String name;
    private final String login;
    private final String password;
    public static User currentUser;
    private static int rightAnswers = 0;
    public static List<User> userDB = new ArrayList(); 
    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public boolean enter(String login, String password){
        return login.equals(this.login) && password.equals(this.password);
    }
    public String getName(){
        return this.name;
    }
    public int plusRightAnswer(){
        return this.rightAnswers++;
    }
    public int getMark(){
        return this.rightAnswers;
    }
    
}
