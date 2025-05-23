/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Artjoms Sidorevics
 */
public class QuestionFileOut {
    public QuestionFileOut(String path, int questionID){
        loadQuestions(path, questionID);
    }
    private void loadQuestions(String path, int questionID){
        String strLine;
        int index=0;
        try {
            FileInputStream fstream = new FileInputStream(path);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader fileout = new BufferedReader(new InputStreamReader(in));

            while ((strLine = fileout.readLine()) != null)   
            {
                index++;
                if(index == questionID){
                    String[] dati = strLine.split(":");
                    String text = dati[0];
                    String[] answers = {dati[1], dati[2], dati[3], dati[4]};
                    int correct = Integer.parseInt(dati[5]);
                    Question.questions.add(new Question(text, answers, correct));
                }
                else{
                    index++;
                }

            }
        }catch (IOException ex) 
        {}
    }

    
}
