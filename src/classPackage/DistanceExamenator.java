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
public class DistanceExamenator {
    public List<User> users = new ArrayList();

    
    private User findUser(String name, String login, String password){
        return new User(name, login, password);
                  
    }
}
