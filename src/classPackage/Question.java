/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Artjoms Sidorevics
 */
public class Question {
    public static Question currentQuestion;
    public static int currentQuestionID=1;
    public static List<Question> questions = new ArrayList();
    private final String text;
    private final String[] answers;    
    private final int correctAnswer;
    
    public Question(String text, String[] answers, int correctAnswer){
        this.text = text;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
    public void setQuestionText(JLabel jlable){
        String t = this.text;
        jlable.setText(t);
    }
    public void setAnswers(JRadioButton button, int index){
        String a = answers[index];
        button.setText(a);
    }
    public String getText(){
        return text;
    }
    public int getCorrctAnswer(){
        return this.correctAnswer;
    }
    public boolean isCorrectAnswer(int answer){
        return correctAnswer == answer;
    }
}
