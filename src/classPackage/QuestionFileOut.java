/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Artjoms Sidorevics
 */
public class QuestionFileOut {
    public QuestionFileOut(String path){
        loadQuestions(path);
    }
    private void loadQuestions(String path) {
        try {
            Question.questions.clear();
            BufferedReader fileout = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String line;
            while ((line = fileout.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length < 6) continue;
                String text = parts[0];
                String[] answers = { parts[1], parts[2], parts[3], parts[4] };
                int correct = Integer.parseInt(parts[5]);
                boolean isLast = !fileout.ready();
                Question.questions.add(new Question(text, answers, correct, isLast));
            }
            fileout.close();
        } catch (IOException ex) 
        {}
    }

}
