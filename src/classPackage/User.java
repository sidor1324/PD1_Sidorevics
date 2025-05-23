/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.util.ArrayList;

/**
 *
 * @author Artjoms Sidorevics
 */
public class User {
    private String name, login, password;
    public static User currentUser;
    public static ArrayList<User> userDB = new ArrayList<>(); 
    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public boolean enter(String login, String password){
        return login.equals(this.login) && password.equals(this.password);
    }
    public int setRightAnswer(){
        Student s = new Student(name, login, password);
        return s.setRightAnswer();
    }
    
}
