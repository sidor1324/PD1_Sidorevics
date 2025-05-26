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
    public QuestionFileOut(String path){
        loadQuestions(path);
    }
    /*private void loadQuestions(String path, int questionID){
        int index=0;
        try {
            FileInputStream fstream = new FileInputStream(path);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader fileout = new BufferedReader(new InputStreamReader(in));
            String strLine;
            String nextLine = fileout.readLine();

            while (nextLine != null){
                strLine = nextLine;
                nextLine = fileout.readLine(); // Читаем наперёд
                boolean isLastLine = (nextLine == null);
                index++;
                if(index == questionID){
                    String[] dati = strLine.split(":");
                    String text = dati[0];
                    String[] answers = {dati[1], dati[2], dati[3], dati[4]};
                    int correct = Integer.parseInt(dati[5]);
                    Question.questions.add(new Question(text, answers, correct, isLastLine));
                }
                else{
                    index++;
                }
            }
        }catch (IOException ex) 
        {}
    }*/
    private void loadQuestions(String path) {
        try {
            Question.questions.clear();
            BufferedReader fileout = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String line;
            while ((line = fileout.readLine()) != null) {
               String[] parts = line.split(":");
                if (parts.length < 6) continue; // защита
                String text = parts[0];
                String[] answers = { parts[1], parts[2], parts[3], parts[4] };
                int correct = Integer.parseInt(parts[5]);
                boolean isLast = !fileout.ready(); // если дальше нет строк — это последний вопрос
                Question.questions.add(new Question(text, answers, correct, isLast));
            }
            fileout.close();
        } catch (IOException ex) 
        {}
    }

}
