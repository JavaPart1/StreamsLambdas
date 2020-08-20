package be.vdab;

import be.vdab.services.FileReaderService;

import java.util.Collections;
import java.util.Scanner;

public class Oef20_1_Timothy {
    private Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        new Oef20_1_Timothy().start();
    }

    private void start() {
        System.out.println("give path to file of press '.' to get the default file RandomText.txt");
        String path = input.next();
        if(path.equals(".")){
            path = "RandomText.txt";
        }
        FileReaderService fileReaderService = new FileReaderService(path);
        fileReaderService.readFile().stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }

}
