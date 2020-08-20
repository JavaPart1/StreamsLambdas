package be.vdab;

import be.vdab.domain.DriverExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriversLicenceExam {
    public static void main(String[] args) {
        // Create driver exam
        DriverExam driverExam = new DriverExam(new ArrayList<>
                (Arrays.asList(1,5,4,1,1,3,2,3,4,4,2,3,3,3,1,5,5,2,1,3)));

        // Student answers
        ArrayList<Integer> studentAnswers = new ArrayList<>
                (Arrays.asList(1,5,4,1,1,3,5,3,4,4,1,3,5,3,1,5,4,2,1,3));
        driverExam.setStudentAnswers(studentAnswers);

        System.out.println("\nDrivers Licence Exam");
        System.out.println("--------------------");
        System.out.println("Student passed? " + driverExam.passed());
        System.out.println("Answers correct? " + driverExam.totalCorrect());
        System.out.println("Answers wrong? " + driverExam.totalInCorrect());

        System.out.println("Which questions are wrong : ");
        driverExam.questionsMissed().stream().
                forEach(e-> System.out.println("question: "+e + " "));
    }
}
