/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.util.List;

/**
 *
 * @author Artjoms Sidorevics
 */
public class Admin extends User {
    private String name = "Admin", login="Admin", password="Admin";
    public Admin(String name, String login, String password) {
        super(name, login, password);
    }
    public void addQuestion(Question text, List<Question> questionList, String answer){
        questionList.add(text);
    }
    public void removeQuestion(int index, List<Question> questionList){
        questionList.remove(index);        
    }
    public void removeUser(User login, List<User> userList){
        userList.remove(login);
    }
            
    
}
