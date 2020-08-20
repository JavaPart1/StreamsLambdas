package be.vdab;

import be.vdab.domain.DriverExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriversLicenceExam {
    public static void main(String[] args) {
        // Create driver exam
        DriverExam driverExam = new DriverExam(new ArrayList<>
                (Arrays.asList('A','E','D','A','A','C','B','C','C','D','B','C','C','C','A','E','E','B','A','C')));

        // Student answers
        ArrayList<Character> studentAnswers = new ArrayList<>
                (Arrays.asList('A','E','D','A','A','C','B','C','C','D','A','C','C','C','A','E','E','B','A','C'));
        driverExam.setStudentAnswers(studentAnswers);

        System.out.println("\nDrivers Licence Exam");
        System.out.println("--------------------");
        System.out.println("Student passed? " + driverExam.passed());
        System.out.println("Answers correct? " + driverExam.totalCorrect());
        System.out.println("Answers wrong? " + driverExam.totalInCorrect());

        System.out.println("Which questions are wrong : ");
        driverExam.questionsMissed().stream().
                forEach(e-> System.out.println(" question: "+(e+1)));
    }
}
