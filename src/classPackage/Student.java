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
    private int questionCount = 0;
    private int rightAnswers = 0;
    public Student(String name, String login, String password) {
        super(name, login, password);
    }

    public void clear(){
        questionCount = 0;
        rightAnswers = 0;
    }
    
   /* public void getAnswer(Question question, String answer){
        Question q = new Question(question.toString(), answer, correctAnswer);
        if(q.isCorrect(answer)){
            questionCount++;
            rightAnswers++;
        }
        else{
            questionCount++;
        }
    }*/
    @Override
    public int setRightAnswer(){
        return rightAnswers++;
    }
}
