package be.vdab.domain;

import be.vdab.DriversLicenceExam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DriverExam {
    Logger loggerd = LoggerFactory.getLogger(DriverExam.class);

    //String programName = "DriverExam";

    //loggerd.info("{} started", programName);

    private ArrayList<Character> correctAnswers;
    private ArrayList<Character> studentAnswers;
    final private int MINNUMBERCORRECTANSWERS = 15;

    public DriverExam(ArrayList<Character> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setStudentAnswers(ArrayList<Character> studentAnswers) {
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
