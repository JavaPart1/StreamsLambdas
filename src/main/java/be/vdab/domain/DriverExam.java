package be.vdab.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DriverExam {
    private ArrayList<Integer> correctAnswers;
    private ArrayList<Integer> studentAnswers;
    final private int MINNUMBERCORRECTANSWERS = 15;

    public DriverExam(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setStudentAnswers(ArrayList<Integer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public boolean passed(){
        if (totalCorrect() >= MINNUMBERCORRECTANSWERS){
            return true;
        }else{
            return false;
        }
    }

    public int totalCorrect(){
        int nbrCorrectAnswers = 0;
        for (int i = 0; i < studentAnswers.size(); i++) {
            if (studentAnswers.get(i) == correctAnswers.get(i)){
                nbrCorrectAnswers++;
            }
        }
        return nbrCorrectAnswers;
    }
    public int totalInCorrect(){
        return correctAnswers.size()-totalCorrect();
    }

    public List<Integer> questionsMissed(){
        List<Integer> questionsWrong = new ArrayList<>();
        for (int i = 0; i < studentAnswers.size(); i++) {
            if (studentAnswers.get(i) != correctAnswers.get(i)){
                questionsWrong.add(i);
            }
        }
        return questionsWrong;
    }
}
