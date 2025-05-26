/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

/**
 *
 * @author Artjoms Sidorevics
 */
public class Student extends User{
    private String name, login, password;  
    private static int rightAnswers = 0;
    public Student(String name, String login, String password) {
        super(name, login, password);
    }
    public int setRightAnswer(){
        return this.rightAnswers++;
    }
    public int get(){
        return this.rightAnswers;
    }
}
